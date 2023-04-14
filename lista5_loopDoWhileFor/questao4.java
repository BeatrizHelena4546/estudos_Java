import java.util.Scanner;

public class ProgramaNumeroTriangular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para verificar se ele é triangular: ");
        int numero = scanner.nextInt();

        int soma = 0;
        int k = 1;

        while (soma < numero) {
            soma += k;
            k++;

            if (soma == numero) {
                System.out.println(numero + " é um número triangular!");
                return;
            }
        }

        System.out.println(numero + " não é um número triangular!");
    }
}
