//import java.util.Scanner;
//
//public class questao1 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//    }
//}

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numero;
        double tabuada;

        System.out.println("Digite um numero : ");
        numero = scan.nextDouble();

        for(int i = 1;i<=10;i++){
            tabuada = numero * i;
            System.out.println(numero + " x " + i +" = " + tabuada);
        }
        scan.close();
    }
}