package exercicios_matriz;

import java.util.Random;

public class questao5 {
/*
 * Quest�o5. 
 * Leia uma matriz 5x 5e escreva a localiza��o (linha e a coluna) do 
 *  maior  valor.  Considere  que  a  matriz  n�o  ter�  elementos repetidos
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[5][5];
		int maior = 0;
		int linha_maior = 0;
		int coluna_maior = 0;
		
		Random random = new Random();
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
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
		
		System.out.println("Maior numero : "+maior+" / Posição desse numero na matriz : matriz["+linha_maior+"]["+coluna_maior+"]");
		System.out.println("");
	}

}
