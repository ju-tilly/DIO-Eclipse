package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		gato.setNome("Borel");
		gato.setCor("Preto e branco");
		gato.setIdade(2);
		Livros livros = new Livros();

		System.out.println("Nome do Gato � : " + gato.getNome() + "\nCor do gato � : " + gato.getCor() + "\nIdade gato �: " + gato.getIdade());
		System.out.println(livros);
		/*
		 * int a = 10; int b = 20; System.out.println("Hello Tester Eclipse! " + (a+b));
		 */
	}
}

class Livros {
	private String nome;
	private String npag;
}