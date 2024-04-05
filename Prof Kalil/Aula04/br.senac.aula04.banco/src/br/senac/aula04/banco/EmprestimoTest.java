package br.senac.aula04.banco;

public class EmprestimoTest {

	public static void main (String[] args) {
		Emprestimo emp = new Emprestimo();
		emp.setValor(1000);
		emp.setNumeroParcelas(10);
		emp.emprestar();
	}

}
