package br.com.alura;

import java.util.ArrayList;

public class TestaListaDeAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Herança", 15);
		Aula a2 = new Aula("Polimorfismo", 10);
		Aula a3 = new Aula("Interface", 20);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
	}

}
