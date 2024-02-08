package exercicio_contaCorrente;

import java.time.LocalDate;

public class Conta_Poupanca extends Conta_Bancaria {

	private int diaRendimento;

	public Conta_Poupanca(String nomeCliente, String numConta, double saldo, int diaRendimento) {
		super(nomeCliente, numConta, saldo);
		this.diaRendimento = diaRendimento;
	}
	
	public void calcularNovoSaldo(double taxaRendimento) {
        int diaAtual = LocalDate.now().getDayOfMonth();

        if (diaRendimento == diaAtual) {
            double rendimento = saldo * taxaRendimento;
            saldo += rendimento;
            System.out.println("Novo saldo com rendimento: " + saldo);
        } else {
            System.out.println("Não é dia de rendimento.");
        }
    }
}
