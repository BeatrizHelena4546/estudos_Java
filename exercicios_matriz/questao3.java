package exercicios_matriz;

import java.util.Scanner;

public class questao3 {
/*
 * Quest�o3. Capture do teclado valores para preenchimento 
 * de uma matriz M 3x3. Ap�s a captura imprima a matriz criada e 
 * encontre a quantidade de n�meros pares, a quantidade de n�meros �mpares.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int pares = 0;
		int impares = 1;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("Digite um numero : ");
				matriz[i][j] = scan.nextInt();
				if(matriz[i][j]%2 == 0) {
					pares++;
				}else {
					impares++;
				}
			}
			System.out.println();
		}
		System.out.println("\nMatriz : ");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Pares : "+ pares);
		System.out.println("Impares : "+ impares);

		scan.close();
	}

}
