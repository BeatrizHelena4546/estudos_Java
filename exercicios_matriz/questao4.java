package exercicios_matriz;

public class questao4 {
/*
 * Quest�o4. 
 * Gere  e  imprima  uma  matriz  M10x10  com  valores 
 * aleat�rios entre 0-9. Ap�s isso indique qual � o maior e o 
 * menor valor da linha 5 e qual � o maior e o menor valor da 
 * coluna 7.
 * 
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[10][10];
		int maior_5 = matriz[4][0];
		int menor_5 = 99999;
		int maior_7 = matriz[0][6];
		int menor_7 = 99999;
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				matriz[i][j] = (int)(Math.random() * 9 + 1);
			}
		}
		
		for(int j=0;j<10;j++){
			if(matriz[4][j] > maior_5) {
				maior_5 = matriz[4][j];
			}
			if(matriz[4][j] < menor_5) {
				menor_5 = matriz[4][j];
			}
		}
		for(int i=0;i<10;i++){
			if(matriz[i][6] > maior_7) {
				maior_7 = matriz[i][6];
			}
			if(matriz[i][6] < menor_7) {
				menor_7 = matriz[i][6];
			}
		}
		

		System.out.println("Matriz : ");
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Maior numero da linha 5 : "+maior_5);
		System.out.println("Menor numero da linha 5 : "+menor_5);
		System.out.println("Maior numero da coluna 7 : "+maior_7);
		System.out.println("Menor numero da coluna 7 : "+menor_7);
	}

}
