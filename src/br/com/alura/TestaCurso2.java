package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando Coleções com Java", "Alice Meneses");
		
		javaColecoes.adiciona(new Aula("Manipulando Array",10));
		javaColecoes.adiciona(new Aula("Diferença entre LinkedList e ArrayList",15));
		javaColecoes.adiciona(new Aula("Vector",5));
		
		System.out.println(javaColecoes.getAulas());
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas(); 
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
		
	}

}
