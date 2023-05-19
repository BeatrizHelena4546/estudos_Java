package exercicio_contaDeLuz;

public class teste {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Planilha planilha = new Planilha();

    ContaLuz conta1 = new ContaLuz("01/01/2023", 1, 100, 100.0, "10/01/2023", 50.0);
   
    ContaLuz conta2 = new ContaLuz("01/02/2023", 2, 120, 120.0, "10/02/2023", 60.0);
    ContaLuz conta3 = new ContaLuz("01/03/2023", 3, 80, 80.0, "10/03/2023", 40.0);
    ContaLuz conta4 = new ContaLuz("01/04/2023", 4, 150, 150.0, "10/04/2023", 75.0);
    ContaLuz conta5 = new ContaLuz("01/05/2023", 5, 90, 90.0, "10/05/2023", 45.0);

    planilha.adicionarConta(conta1);
    planilha.adicionarConta(conta2);
    planilha.adicionarConta(conta3);
    planilha.adicionarConta(conta4);
    planilha.adicionarConta(conta5);

    ContaLuz mesMenorConsumo = planilha.obterMesMenorConsumo();
    if (mesMenorConsumo != null) {
        System.out.println("Mes de menor consumo:");
        System.out.println("Data de Leitura: " + mesMenorConsumo.getDataLeitura());
        System.out.println("Numero da Leitura: " + mesMenorConsumo.getNumeroLeitura());
        System.out.println("Media de Consumo: " + mesMenorConsumo.getMediaConsumo());
        System.out.println();
    } else {
        System.out.println("Nao foram encontradas contas de luz registradas.");
    }

    ContaLuz mesMaiorConsumo = planilha.obterMesMaiorConsumo();
    if (mesMaiorConsumo != null) {
        System.out.println("Mes de maior consumo:");
        System.out.println("Data de Leitura: " + mesMaiorConsumo.getDataLeitura());
        System.out.println("Numero da Leitura: " + mesMaiorConsumo.getNumeroLeitura());
        System.out.println("Media de Consumo: " + mesMaiorConsumo.getMediaConsumo());
        System.out.println();
    } else {
        System.out.println("Nao foram encontradas contas de luz registradas.");
    }
}
}




	


