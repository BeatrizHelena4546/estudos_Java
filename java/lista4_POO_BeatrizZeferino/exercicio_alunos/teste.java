package exercicio_alunos;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Professor professor = new Professor("João", "Departamento de Ciências", "joao@example.com");
        Curso curso = new Curso("Matemática", "Segunda-feira, 8h", professor);

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nAluno " + i + ":");
            System.out.print("Digite o nome: ");
            String nomeAluno = scan.nextLine();
            System.out.print("Digite a matrícula: ");
            String matricula = scan.nextLine();

            Aluno aluno = new Aluno(nomeAluno, matricula);
            curso.adicionarAluno(aluno);

            System.out.print("Digite a nota 1: ");
            double nota1 = Double.parseDouble(scan.nextLine());

            System.out.print("Digite a nota 2: ");
            double nota2 = Double.parseDouble(scan.nextLine());

            System.out.print("Digite a nota 3: ");
            double nota3 = Double.parseDouble(scan.nextLine());

            System.out.print("Digite a nota 4: ");
            double nota4 = Double.parseDouble(scan.nextLine());

            curso.definirNotas(aluno, nota1, nota2, nota3, nota4);
        }

        curso.imprimirMedias();
    }
}


