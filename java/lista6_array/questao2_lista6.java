package lista6_array;

import java.util.Arrays;

public class questao2_lista6 {
    public static void main(String[] args) {
    
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = (int)(Math.random() * 10) + 1;
        }

        for(int i = 0; i < vetorA.length; i++){
            vetorB[i] = vetorA[i] * i;
            vetorC[i] = vetorA[i] % 2;
        }
        System.out.println("Vetor A: " + Arrays.toString(vetorA));
        System.out.println("Vetor B: " + Arrays.toString(vetorB));
        System.out.println("Vetor C: " + Arrays.toString(vetorC));
    }
    
}
