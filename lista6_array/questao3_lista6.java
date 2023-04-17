package lista6_array;

import java.util.Arrays;

public class questao3_lista6 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[][] vetorC = new int[4][10];

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = (int)(Math.random() * 10) + 1;
            vetorB[i] = (int)(Math.random() * 10) + 1;
        }

        for(int i = 0; i < vetorA.length; i++){
            vetorC[0][i] = vetorA[i] + vetorB[i];
            vetorC[1][i] = vetorA[i] - vetorB[i];
            vetorC[2][i] = vetorA[i] * vetorB[i];
            vetorC[3][i] = vetorA[i] / vetorB[i];
        }

        System.out.println("Vetor A: "+Arrays.toString(vetorA));
        System.out.println("Vetor B: "+Arrays.toString(vetorB));
        System.out.println("Matriz C : ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(vetorC[i][j] + " ");
            }
            
        }

    }
    
}
