package br.senac.edu.modelo.entidade.pessoa.aluno;

import br.senac.edu.modelo.entidade.pessoa.Pessoa;
import br.senac.edu.modelo.entidade.turma.Turma;

public class Aluno extends Pessoa{

	private Turma turma;
	private Status status;
	private String matricula;

	public Aluno(String nome, byte idade, String cpf, Status status) {
		super(nome, idade, cpf);
		setMatricula(matricula);
		setStatus(Status.MATRICULADO);
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Aluno(String nome, byte idade, String cpf, Turma turma ,Status status) {
		super(nome, idade, cpf);
		setStatus(status);
	}

	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		
	}

	public void responderChamada() {
		System.out.println("Presente!");
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
}