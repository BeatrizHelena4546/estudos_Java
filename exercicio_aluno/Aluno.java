package exercicio_aluno;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private String[] disciplinas;
    private double[] notas;

    public Aluno() {
        disciplinas = new String[3];
        notas = new double[3];
    }

    public void setInformacoes() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        nome = scan.nextLine();

        System.out.print("Digite a matrícula do aluno: ");
        matricula = scan.nextLine();

        System.out.print("Digite o curso do aluno: ");
        curso = scan.nextLine();

        for (int i = 0; i < disciplinas.length; i++) {
            System.out.print("Digite o NOME da disciplina " + (i + 1) + ": ");
            disciplinas[i] = scan.nextLine();

            System.out.print("Digite a NOTA da disciplina " + (i + 1) + ": ");
            notas[i] = scan.nextDouble();
        }

        scan.close();
    }

    public void mostrarInformacoes() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Matrícula do aluno: " + matricula);
        System.out.println("Curso do aluno: " + curso);

        for (int i = 0; i < disciplinas.length; i++) {
            System.out.println("Disciplina " + (i + 1) + ": " + disciplinas[i]);
            System.out.println("Nota: " + notas[i]);
            System.out.println("Situação: " + (notas[i] >= 7 ? "Aprovado" : "Reprovado"));
        }
    }

    
}
