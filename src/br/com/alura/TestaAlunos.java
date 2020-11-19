package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet();
		
		alunos.add("Alice Meneses");
		alunos.add("Gabriella");
		alunos.add("Maria");
		alunos.add("Julianne");
		alunos.add("Isa");
		
		System.out.println(alunos);
		System.out.println();
		
		alunos.forEach((aluno) -> {
			System.out.println(aluno);
		});
		
	}

}
