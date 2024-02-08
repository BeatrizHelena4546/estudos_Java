package exercicio_contaDeLuz;

import java.util.ArrayList;

class Planilha {
    private ArrayList<ContaLuz> contas;

    public Planilha() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(ContaLuz conta) {
        contas.add(conta);
    }

    public ContaLuz obterMesMenorConsumo() {
        ContaLuz menorConsumo = null;
        double menorValor = Double.MAX_VALUE;

        for (ContaLuz conta : contas) {
            if (conta.getMediaConsumo() < menorValor) {
                menorValor = conta.getMediaConsumo();
                menorConsumo = conta;
            }
        }

        return menorConsumo;
    }

    public ContaLuz obterMesMaiorConsumo() {
        ContaLuz maiorConsumo = null;
        double maiorValor = Double.MIN_VALUE;

        for (ContaLuz conta : contas) {
            if (conta.getMediaConsumo() > maiorValor) {
                maiorValor = conta.getMediaConsumo();
                maiorConsumo = conta;
            }
        }

        return maiorConsumo;
    }
}
