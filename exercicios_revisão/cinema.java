package exercicios_revisão;

import java.util.Scanner;

public class cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade, otimo = 0, bom = 0, regular = 0, ruim = 0, pessimo = 0;
        int maiorIdadeRuim = 0, maiorIdadeOtimo = 0,resultadoMaiorIdade = 0, maiorIdadePessimo = 0, diferencaIdades;
        float mediaIdadeRuim, percentualBom, percentualRegular, percentualPessimo, difPerBomRegular;

        for(int i=0; i < 5; i++){
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();
            System.out.println("Qual a sua opinião: (O) Ótimo, (B) Bom, (R) regular, (RR) ruim, (P) Péssimo : ");
            String opiniao = scan.next().toUpperCase();

            switch (opiniao) {

                case "O":
                    ++otimo;
                    if (idade > maiorIdadeOtimo) {
                        maiorIdadeOtimo = idade;
                    }
                    break;
                case "B":
                    ++bom;
                    break;
                case "R":
                    ++regular;
                    break;
                case "RR":
                    ++ruim;
                    if (idade > maiorIdadeRuim) {
                        maiorIdadeRuim = idade;
                    }
                    break;
                case "P":
                    ++pessimo;
                    if (idade > maiorIdadePessimo) {
                        maiorIdadePessimo = idade;
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
                    i--;
                    break;
        }
    }
    percentualBom = (float)bom/100*100;
    percentualRegular = (float)regular/100*100;
    percentualPessimo = (float) pessimo/100*100;
    mediaIdadeRuim = (float) maiorIdadeRuim/ruim;
    resultadoMaiorIdade = maiorIdadeOtimo - maiorIdadeRuim;
    difPerBomRegular = percentualBom - percentualRegular;
    
    System.out.println("Total de quantidade ótimo:" + otimo);
    System.out.println("Diferença percentual entre respostas boas e regular:" + difPerBomRegular);
    System.out.println("média de idade das pessoas que responderam ruim:" + mediaIdadeRuim);
    System.out.println("percentagem de respostas péssimo e a maior idade que utilizou essa opção: " + percentualPessimo + "% / " + maiorIdadePessimo);
    System.out.println("a diferença de idade entre a maior idade que respondeu ótimo e a maior idade que respondeu ruim: " + resultadoMaiorIdade);

    scan.close();
}
}
