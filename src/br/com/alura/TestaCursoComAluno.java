package br.com.alura;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Alice Meneses", "Dominando Cole��es com Java");

		javaColecoes.adiciona(new Aula("Manipulando Array", 10));
		javaColecoes.adiciona(new Aula("Diferen�a entre LinkedList e ArrayList", 15));
		javaColecoes.adiciona(new Aula("Vector", 5));
		
		
	}

}
