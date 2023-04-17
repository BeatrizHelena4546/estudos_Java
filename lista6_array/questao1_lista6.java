package lista6_array;

public class questao1_lista6 {
    public static void main(String[] args) {
        int[] vetorA = new int[15];
        int[] vetorB = new int[15];

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = (int)(Math.random() * 100);
        }

        for(int j = 0; j < vetorA.length; j++) {
            vetorB[j] = vetorA[j] * vetorA[j];
        }

        System.out.print("Vetor A : ");
        for(int k = 0; k < vetorA.length; k++ ){
            System.out.print(vetorA[k]+" ");
        }

        System.out.print("\nVetor B: ");
            for(int l = 0; l < vetorB.length; l++) {
        System.out.print(vetorB[l] + " ");
        }
    }
}
