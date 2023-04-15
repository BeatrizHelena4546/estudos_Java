import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro para verificar se ele é triangular: ");
        int numero = scan.nextInt();

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
