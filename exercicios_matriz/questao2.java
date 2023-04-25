package exercicios_matriz;

import java.util.Random;

public class questao2 {
/* 2� quest�o : 
 * Gere e imprima uma matriz M 4x4 com valores aleat�rios entre 0-9. 
 * Ap�s isso determine o maior n�mero da matriz e a sua posi��o(linha, coluna).
 * 
 * MAIOR QUE = >
 * MENOR QUE = <
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[4][4];
		int maior = 0;
		int linha_maior = 0;
		int coluna_maior = 0;
		
		Random random = new Random();
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				matriz[i][j] = random.nextInt(10);
				System.out.print(matriz[i][j] + " ");
				if(matriz[i][j] > maior) {
					maior = matriz[i][j];
					linha_maior = i;
					coluna_maior = j;
				}
			}
			System.out.println();
		}
		
		System.out.println("Maior numero : "+maior+" / Posição desse numero na matriz : matriz["+(linha_maior+1)+"]["+(coluna_maior+1)+"]");
		System.out.println("");
	}

}
