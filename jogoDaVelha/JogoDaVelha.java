import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		String[][] tabuleiro = { { " - ", " - ", " - " }, { " - ", " - ", " - " }, { " - ", " - ", " - " } };

		boolean temGanhador = false, deuVelha = false, jogada = false;
		int posicaoI, posicaoJ;
		int contador = 0;
		String vez = "X";
		String ganhador;

		do {

			if (contador < 9) {

				if (contador % 2 == 0) {
					vez = " X ";
				} else {
					vez = " O ";
				}

				System.out.println();

				System.out.println("   1  2  3");

				for (int i = 0; i < tabuleiro.length; i++) {

					System.out.print((i + 1) + " ");

					for (int j = 0; j < tabuleiro[i].length; j++) {
						System.out.print(tabuleiro[i][j]);
					}
					System.out.println();
				}

				do {

					System.out.println("\nVez do jogador" + vez);

					jogada = false;
					System.out.print("Linha: ");
					posicaoI = leitor.nextInt();
					System.out.print("Coluna: ");
					posicaoJ = leitor.nextInt();

					if (tabuleiro[posicaoI - 1][posicaoJ - 1] != " - ") {
						System.out.println("\nPosição ocupada, escolha outra");
					} else {
						tabuleiro[posicaoI - 1][posicaoJ - 1] = vez;
						jogada = true;
					}

				} while (jogada == false);

				if (tabuleiro[0][0] == tabuleiro[0][1] && tabuleiro[0][0] == tabuleiro[0][2]
						&& tabuleiro[0][0] != " - ") {
					temGanhador = true;
				} else {
					if (tabuleiro[1][0] == tabuleiro[1][1] && tabuleiro[1][0] == tabuleiro[1][2]
							&& tabuleiro[1][0] != " - ") {
						temGanhador = true;
					} else {
						if (tabuleiro[2][0] == tabuleiro[2][1] && tabuleiro[2][0] == tabuleiro[2][2]
								&& tabuleiro[2][0] != " - ") {
							temGanhador = true;
						} else {
							if (tabuleiro[0][0] == tabuleiro[1][0] && tabuleiro[0][0] == tabuleiro[2][0]
									&& tabuleiro[0][0] != " - ") {
								temGanhador = true;
							} else {
								if (tabuleiro[0][1] == tabuleiro[1][1] && tabuleiro[0][1] == tabuleiro[2][1]
										&& tabuleiro[0][1] != " - ") {
									temGanhador = true;
								} else {
									if (tabuleiro[0][2] == tabuleiro[1][2] && tabuleiro[0][2] == tabuleiro[2][2]
											&& tabuleiro[0][2] != " - ") {
										temGanhador = true;
									} else {
										if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[0][0] == tabuleiro[2][2]
												&& tabuleiro[0][0] != " - ") {
											temGanhador = true;
										} else {
											if (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[0][2] == tabuleiro[2][0]
													&& tabuleiro[0][2] != " - ") {
												temGanhador = true;
											}
										}
									}
								}
							}
						}
					}
				}

			} else {
				deuVelha = true;
			}

			contador++;

		} while (temGanhador != true && deuVelha != true);

		System.out.println();

		System.out.println("   1  2  3");

		for (int i = 0; i < tabuleiro.length; i++) {

			System.out.print((i + 1) + " ");

			for (int j = 0; j < tabuleiro[i].length; j++) {
				System.out.print(tabuleiro[i][j]);
			}
			System.out.println();
		}

		if (temGanhador == true) {
			ganhador = vez;
			System.out.println("\nGanhador: " + ganhador);
		} else {
			if (deuVelha == true) {
				System.out.println("\nDEU VELHA");
			}
		}

		leitor.close();
		
	}

}
