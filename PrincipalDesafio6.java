package AvFormativa.desafios;

public class PrincipalDesafio6 {

	public static void main(String[] args) {
		Coracao coracao = new Coracao (70);
		Pessoa3 pessoa = new Pessoa3 ("Lucas",coracao.getBatimentos());

		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getCoracao());
	}

}
