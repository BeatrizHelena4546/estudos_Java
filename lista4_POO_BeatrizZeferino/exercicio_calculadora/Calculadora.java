package exercicio_calculadora;

public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("Não é possível dividir por zero.");
        }
    }

    public double elevarPotencia(double base, int expoente) {
        return Math.pow(base, expoente);
    }
}

