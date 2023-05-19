package exercicio_contaCorrente;

public class teste_3 {
    public static void main(String[] args) {
        Conta_Bancaria conta = new Conta_Bancaria(1234, 1000.0, true, 500.0);
    
        conta.consultarSaldo(); // Saldo: 1000.0
        conta.sacar(1500.0); // Saldo insuficiente
        conta.depositar(500.0); // Depósito realizado com sucesso
        conta.consultarSaldo(); // Saldo: 1500.0
        System.out.println("Usando cheque especial: " + conta.usandoChequeEspecial()); // Usando cheque especial: true
    }
}

    