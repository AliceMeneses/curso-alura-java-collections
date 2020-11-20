package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

	public static void main(String[] args) {
		Collection<String> alunos = new HashSet();
		
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
		
		boolean inseriu = alunos.add("Alice Meneses");
		
		System.out.println("Inseriu? " + inseriu);
		System.out.println("Quantidade de elementos armazenados na coleção: " + alunos.size());
		
		List<String> listaAlunos = new ArrayList<>(alunos);
		
	}

}
