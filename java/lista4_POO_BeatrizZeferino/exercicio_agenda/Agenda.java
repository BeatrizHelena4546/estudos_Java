package exercicio_agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private String nome;
    private List<Contato> contatos;

    public Agenda(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public String informacaoContato(Contato contato) {
        return "Nome: " + contato.getNome() +
                "\nTelefone: " + contato.getTelefone() +
                "\nEmail: " + contato.getEmail();
    }

    public String informacaoTodosContatos() {
        StringBuilder info = new StringBuilder();
        for (Contato contato : contatos) {
            info.append(informacaoContato(contato)).append("\n\n");
        }
        return info.toString();
    }
}

