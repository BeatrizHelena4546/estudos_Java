package exercicio_calculadora;

public class teste1 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int soma = calculadora.somar(10, 5);
        System.out.println("Soma: " + soma); // Saída: 15

        int subtracao = calculadora.subtrair(10, 5);
        System.out.println("Subtração: " + subtracao); // Saída: 5

        int multiplicacao = calculadora.multiplicar(10, 5);
        System.out.println("Multiplicação: " + multiplicacao); // Saída: 50

        int divisao = calculadora.dividir(10, 5);
        System.out.println("Divisão: " + divisao); // Saída: 2

        double potencia = calculadora.elevarPotencia(2.0, 3);
        System.out.println("Potência: " + potencia); // Saída: 8.0
    }
}
