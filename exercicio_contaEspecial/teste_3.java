package exercicio_contaCorrente;

public class teste_3 {
    public static void main(String[] args) {
        Conta_Poupanca contaPoupanca = new Conta_Poupanca("Joao / Conta Poupança", "123456", 500, 1);
        Conta_Especial contaEspecial = new Conta_Especial("Maria / Conta Especial", "789012", 1000.0, 3000);

        contaPoupanca.depositar(1000.0);
        contaPoupanca.sacar(500.0);
        contaPoupanca.calcularNovoSaldo(0.05);
        contaPoupanca.mostrarDados();

        contaEspecial.depositar(1000.0);
        contaEspecial.sacar(1500.0);
        contaEspecial.mostrarDados();
    }
}