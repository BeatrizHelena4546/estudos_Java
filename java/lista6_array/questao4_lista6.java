package lista6_array;

import java.util.Arrays;

public class questao4_lista6 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] impar  = new int[10];
        int[] par    = new int[10];

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = (int)(Math.random() * 10) + 1;
        }

        for(int i = 0; i < vetorA.length; i++){
            if (vetorA[i] % 2 == 0) {
                par[i] = vetorA[i];
            }else{
                impar[i] = vetorA[i];
            }
        }

        System.out.println("Vetor A : "+Arrays.toString(vetorA));
        System.out.println("Impar   : "+Arrays.toString(impar));
        System.out.println("Par     : "+Arrays.toString(par));
    }
    
}
