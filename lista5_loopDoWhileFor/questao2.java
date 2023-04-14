import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 1001;
        int contador = 0;

        while(contador < 5){
            if (numero % 11 = 5){
                contador++;
            }

            if (contador == 5){
                break;
            }

            numero++;

        }
        System.out.println("O quinto número maior que 1000, cuja divisão por 11 tem resto 5, é : "+ numero);
    }
}