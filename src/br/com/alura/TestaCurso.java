package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando Coleções com Java", "Alice Meneses");
		
		javaColecoes.adiciona(new Aula("Manipulando Array",10));
		javaColecoes.adiciona(new Aula("Diferença entre LinkedList e ArrayList",15));
		javaColecoes.adiciona(new Aula("Vector",5));
		
		System.out.println(javaColecoes.getAulas());
		
		try{
		javaColecoes.getAulas().remove(0);
		}
		catch(UnsupportedOperationException ex) {
			System.out.println();
			System.out.println("Exceção ao tentar modificar os elementos de uma lista que não permite ser modificada");
			ex.printStackTrace();
		}
	}

}
