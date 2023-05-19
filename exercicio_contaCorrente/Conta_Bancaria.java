package exercicio_contaCorrente;

public class Conta_Bancaria {
	private int numero;
	private double saldo;
	private boolean especial;
	private double limite;

	public Conta_Bancaria(int numero, double saldo, boolean especial, double limite) {
		this.numero = numero;
		this.saldo = saldo;
		this.especial = especial;
		this.limite = limite;
	}

	public void sacar(double valor) {
		if (valor <= saldo + limite) {
			saldo -= valor;
			System.out.println("Saque realizado com sucesso.");
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}

	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito realizado com sucesso.");
	}

	public void consultarSaldo() {
		System.out.println("Saldo: " + saldo);
	}

	public boolean usandoChequeEspecial() {
		return saldo < 0 && especial;
	}
}
