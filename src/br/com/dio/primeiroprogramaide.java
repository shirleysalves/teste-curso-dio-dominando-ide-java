package br.com.dio;

import br.com.dio.model.gato;

public class primeiroprogramaide {

	public static void main(String[] args) {
		
	gato gato = new gato();	
	Livros livros = new Livros();
	
	System.out.println(gato);
	System.out.println(livros);
		
		/*int a = 2;
		int b =3;
		System.out.println("Hello world " + (a+b));*/
	}

}

class Livros {
	private String nome;
	private String npag;
}