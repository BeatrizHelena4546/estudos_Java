package exercicios_matriz;

import java.util.Arrays;

public class questao1 {
/* 1� quest�o
 * Dada uma matriz de ordem 4x3 contendo valores num�ricos reais. Fa�a um 
 * algoritmo que calcule e exiba a soma dos n�meros positivos e a soma dos 
 * n�meros negativos.
 * 
 * MAIOR QUE = >
 * MENOR QUE = <
 * 
 * System.out.println("Vetor A: " + Arrays.toString(vetorA));
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[4][3];
		int soma_positivos = 0;
		int soma_negativos = 0;
		
		for(int i=0; i < 4;i++) {
			for(int j=0; j < 3; j++) {
				matriz[i][j] = (int)(Math.random() * 20 - 10);
			}
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				if(matriz[i][j]>0) {
					soma_positivos += matriz[i][j];
				}else {
					soma_negativos += matriz[i][j];
				}
			}
		}
		
		System.out.println("\nMatriz:");
        for(int i=0; i<4; i++) {
            for(int j=0; j<3; j++) {
                System.out.println("matriz["+i+"]["+j+"] : "+matriz[i][j] + " ");
            }
            System.out.println();
        }
		System.out.println("Soma dos numeros positivos : "+soma_positivos);
		System.out.println("Soma dos numeros negativos : "+soma_negativos);

	}

}
