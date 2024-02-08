package br.senac.edu;

import br.senac.edu.modelo.entidade.pessoa.aluno.Aluno;
import br.senac.edu.modelo.entidade.pessoa.professor.Professor;

public class Principal {

	public static void main(String[] args) {

		Professor professor01 = new Professor("Aurélio", (byte) 20, "123-.567.987-01", null);

		// professor01.setNome("Aurélio");
		// professor01.setIdade((byte) 20);
		// professor01.setCpf("123-.567.987-01");

		System.out.println("Nome do professor: " + professor01.getNome());
		System.out.println("Idade do professor: " + professor01.getIdade());
		System.out.println("CPF do professor: " + professor01.getCPF());

		professor01.fazerChamada();

		Aluno aluno01 = new Aluno("Maria", (byte) 20, "123.456.789-10", null);

		// aluno01.setNome("Maria");
		// aluno01.setIdade((byte) 20);
		// aluno01.setCPF("123.456.789-10");

		System.out.println("\nNome do aluno: " + aluno01.getNome());
		System.out.println("Idade do aluno: " + aluno01.getIdade());
		System.out.println("CPF do aluno: " + aluno01.getCPF());

		aluno01.responderChamada();

	}
}