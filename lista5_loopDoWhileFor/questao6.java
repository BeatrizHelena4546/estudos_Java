import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero1, numero2;
        int soma = 0;

        System.out.println("Digite numero 1 : ");
        numero1 = scan.nextInt();

        System.out.println("Digite numero 2 : ");
        numero2 = scan.nextInt();

        if (numero1 < numero2) {
            for (int i = numero1; i <= numero2; i++) {
                System.out.println(i);
                soma += i;
            }
        } else {
            for (int i = numero2; i <= numero1; i++) {
                System.out.println(i);
                soma += i;
            }
        }

        System.out.println("A soma dos números no intervalo é: " + soma);
   }
}