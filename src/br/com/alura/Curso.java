package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private String instrutor;
	private String nome;
	private List<Aula> aulas = new ArrayList<>();
	
	public Curso(String instrutor, String nome) {
		this.instrutor = instrutor;
		this.nome = nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<Aula> getAulas() {
		return aulas;
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
}
