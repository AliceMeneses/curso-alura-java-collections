package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Set";
		String aula2 = "ArrayList";
		String aula3 = "LinkedList";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.remove(aula2);
		
		System.out.println(aulas);	
		
		aulas.add(aula2);
		
		System.out.println(aulas);
		
		System.out.println();
		for(int i = 0; i < aulas.size(); i++) {
			System.out.println(aulas.get(i));
		}
		
		System.out.println();
		for (String aula : aulas) {
			System.out.println(aula);
		}
		
		System.out.println();
		aulas.forEach((aula) -> {
			System.out.println(aula);
		});
		
		System.out.println();
		Collections.sort(aulas);
		System.out.println("Lista ordenada:");
		System.out.println(aulas);
		
		System.out.println();
		try {
			aulas.get(5);
		}
		catch(IndexOutOfBoundsException ex){
			System.out.println("Exceção lançada quando tentamos utilizar um elemento com um indice fora do intervalo do indice da lista:");
			ex.printStackTrace();
		}
	}

}
