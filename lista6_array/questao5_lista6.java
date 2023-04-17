package lista6_array;

import java.util.Arrays;

public class questao5_lista6 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] multiCinco = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) (Math.random() * 10) + 1;
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 5 == 0) {
                multiCinco[i] = vetorA[i];
            }
        }

        System.out.println("Vetor A       : " + Arrays.toString(vetorA));
        System.out.println("Multiplo de 5 : " + Arrays.toString(multiCinco));
    }

}
