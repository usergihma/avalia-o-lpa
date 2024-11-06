package AvFormativa.desafios;

public class ConstrutorPessoa {

	public static void main(String[] args) {
		Pessoa1 jogador1 = new Pessoa1();
		Pessoa1 jogador2 = new Pessoa1("Messi",36);
		
		System.out.println(jogador2.getNome());
		System.out.println(jogador2.getIdade());
		
				
	}

}
