package exercicio_agenda;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome da Agenda: ");
        String nomeAgenda = scan.nextLine();

        Agenda agenda = new Agenda(nomeAgenda);

        for (int i = 1; i <= 3; i++) {
            System.out.println("\nContato " + i + ":");
            System.out.print("Digite o nome: ");
            String nomeContato = scan.nextLine();
            System.out.print("Digite o telefone: ");
            String telefoneContato = scan.nextLine();
            System.out.print("Digite o email: ");
            String emailContato = scan.nextLine();

            Contato contato = new Contato(nomeContato, telefoneContato, emailContato);
            agenda.adicionarContato(contato);
        }

        System.out.println("\nInformações dos contatos:\n");
        System.out.println(agenda.informacaoTodosContatos());

        scan.close();
    }
}

