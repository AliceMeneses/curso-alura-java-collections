package br.com.alura;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando Cole��es com Java", "Alice Meneses");
		
		javaColecoes.adiciona(new Aula("Manipulando Array",10));
		javaColecoes.adiciona(new Aula("Diferen�a entre LinkedList e ArrayList",15));
		javaColecoes.adiciona(new Aula("Vector",5));
		
		System.out.println(javaColecoes.getAulas());
		
		
	}

}
