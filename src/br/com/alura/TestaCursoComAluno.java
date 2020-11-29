package br.com.alura;

import java.util.Iterator;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Alice Meneses", "Dominando Coleções com Java");

		javaColecoes.adiciona(new Aula("Manipulando Array", 10));
		javaColecoes.adiciona(new Aula("Diferença entre LinkedList e ArrayList", 15));
		javaColecoes.adiciona(new Aula("Vector", 5));
		
		Aluno a1 = new Aluno("Alice", 7895);
		Aluno a2 = new Aluno("Vitor", 5621);
		Aluno a3 = new Aluno("Vini", 1257);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		javaColecoes.getAlunos().forEach((aluno) -> {
			System.out.println(aluno);
		});
		
		System.out.println();
		System.out.println("Modo antigo de iterar um conjunto:");
		Iterator<Aluno> iterador = javaColecoes.getAlunos().iterator();
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		
		System.out.println();
		System.out.println("Qual é o aluno com a matricula 7895?");
		Aluno aluno = javaColecoes.buscaMatriculado(7895);
		System.out.println(aluno);
	}

}
