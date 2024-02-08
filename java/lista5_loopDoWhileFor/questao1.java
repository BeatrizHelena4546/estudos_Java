import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int produtoImpares = 1;
        int somaPares = 0;

        System.out.println("Digite um numero inteiro e positivo : ");
        numero = scan.nextInt();

        while (numero >= 0){
            if (numero % 2 == 0){
                somaPares += numero;
            }else{
                produtoImpares *= numero;
            }
            System.out.println("Digite outro numero inteiro e positivo(digite um número negativo para sair) : ");
            numero = scan.nextInt();

        }

        System.out.println("A soma de todos os numeros PARES são : "+somaPares);
        System.out.println("O produto de todos os numeros IMPARES são : "+produtoImpares);
        scan.close();
    }
}