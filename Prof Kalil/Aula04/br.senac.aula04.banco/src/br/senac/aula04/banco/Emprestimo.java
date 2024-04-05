package br.senac.aula04.banco;

public class Emprestimo {
	double valor;
	int numeroParcelas;
	
	public void emprestar() {
		double valorFinal = getValor() * Math.pow((1+0.02), getNumeroParcelas());
		
		System.out.printf("Valor da Parcela: %.2f" , valorFinal/getNumeroParcelas());
		
	}
	
	public int getNumeroParcelas() {
		return numeroParcelas;
	}
	public void setNumeroParcelas(int numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}
	public double getValor () {
		return valor;
	}
	public void setValor (double valor) {
		this.valor = valor;
	}
}

