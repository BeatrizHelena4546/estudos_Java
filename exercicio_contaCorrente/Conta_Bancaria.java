package exercicio_contaCorrente;

public class Conta_Bancaria {
	protected String nomeCliente;
	protected String numConta;
	
	protected double saldo;

	public Conta_Bancaria(String nomeCliente, String numConta, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo-=valor;
			System.out.println("Saque realizado com sucesso!");
		}else {
			System.out.println("Saldo insuficiente para saque :(");
		}
	}
	
	
	public void depositar(double valor) {
		if(valor > 0) {
			saldo+=valor;
			System.out.println("Deposito realizado com sucesso!");
		}else {
			System.out.println("Valor invalido para deposito :(");
		}
	}
	
	public void mostrarDados() {
        System.out.println("Nome do Cliente: " + nomeCliente);;
        System.out.println("Número da Conta: " + numConta);
        System.out.println("Saldo: " + saldo);
    }
}
	
	
}
