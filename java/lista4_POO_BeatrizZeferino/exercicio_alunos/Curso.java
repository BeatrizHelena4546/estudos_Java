package exercicio_alunos;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String horario;
    private Professor professor;
    private List<Aluno> alunos;

    public Curso(String nome, String horario, Professor professor) {
        this.nome = nome;
        this.horario = horario;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void definirNotas(Aluno aluno, double nota1, double nota2, double nota3, double nota4) {
        aluno.setNotas(nota1, nota2, nota3, nota4);
    }

    public void imprimirMedias() {
        System.out.println("Médias dos alunos:");
        for (Aluno aluno : alunos) {
            double media = aluno.calcularMedia();
            System.out.println("Aluno: " + aluno.getNome() +
                    "\nMédia: " + media +
                    "\nSituação: " + (media >= 7 ? "Aprovado" : "Reprovado") +
                    "\n");
        }
        double mediaTurma = calcularMediaTurma();
        System.out.println("Média da turma: " + mediaTurma);
    }

    private double calcularMediaTurma() {
        double somaMedias = 0;
        for (Aluno aluno : alunos) {
            somaMedias += aluno.calcularMedia();
        }
        return somaMedias / alunos.size();
    }
}

