package exercicio_contaCorrente;

public class Conta_Especial extends Conta_Bancaria {
    private double limite;

    public Conta_Especial(String nomeCliente, String numConta, double saldo, double limite) {
		super(nomeCliente, numConta, saldo);
		this.limite = limite;
	}

	@Override
    public void sacar(double valor) {
        double saldoDisponivel = saldo + limite;
        if (valor > 0 && valor <= saldoDisponivel) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
}
