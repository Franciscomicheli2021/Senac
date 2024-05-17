package com.senac.elevador;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela extends JFrame {

	private JButton btnAbrir, btnFechar;
	private JButton[] btnAndar;
	private JLabel lblInicio;
	private int andarChamado, andarAtual=0;
	private ActionListener ouvinte;

	public Janela() {
		inicio();

	}

	private void inicio() {
		setTitle("Bem vindo ao Elevador KXPO");
		setSize(800, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // ativa o x para fechar a janela
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		criarPainel();
		setVisible(true);
	}

	private void criarPainel() {
		add(criarLabel()); // ok
		criarBtnAbrirFechar(); // ok
		criarBtnAndares();

	}

	private void criarBtnAndares() {
		ouvinte = (ActionEvent ae) -> {

			chamarElevador(ae.getActionCommand());

		};
		btnAndar = new JButton[5];
		int x = 45;
		for (int i = 0; i < btnAndar.length; i++) {
			btnAndar[i] = new JButton("" + (i + 1));
			btnAndar[i].setBounds(x, 280, 100, 60);
			btnAndar[i].addActionListener(ouvinte);
			x += 145;
			add(btnAndar[i]);
		}
	}

	private void chamarElevador(String andar) {
		this.andarChamado = Integer.parseInt(andar);
		int i = 0;
		while (i < btnAndar.length) {

			if (btnAndar[i].getText().equals(andar)) {
				lblInicio.setText("Chamado: " + andarChamado + "   Atual: " + andarAtual);
				andarAtual = andarChamado;
				break;
			}
			i++;
			// for (int i=0; i<btnAndar.length)
		}

	}

	private void criarBtnAbrirFechar() {
		btnAbrir = new JButton("ABERTO");
		btnFechar = new JButton("FECHADO");
		btnAbrir.setBounds(160, 145, 220, 60);
		btnFechar.setBounds(400, 145, 220, 60);
		add(btnAbrir);
		add(btnFechar);
	}

	private Component criarLabel() {
		lblInicio = new JLabel("Elevador KXPO : Escolha um Andar.");
		lblInicio.setFont(new Font("Arial", Font.PLAIN, 38));
		lblInicio.setHorizontalAlignment(JLabel.CENTER);
		// lblInicio.setVerticalAlignment(JLabel.TOP);
		lblInicio.setBounds(0, 60, 800, 30);
		return lblInicio;
	}

}
