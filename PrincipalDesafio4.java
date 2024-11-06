package AvFormativa.desafios;

public class PrincipalDesafio4 {

	public static void main(String[] args) {
		PessoaFisica jogador1 = new PessoaFisica("Martha","9999989","234562346342","4565324362");
		Pessoa2 jogador2 = new Pessoa2("Messi","9999999");
		
		System.out.println(jogador1.getNome());
		System.out.println(jogador1.getTelefone());
		System.out.println(jogador1.getCpf());
		System.out.println(jogador1.getRg());
		
		System.out.println(jogador2.getNome());
		System.out.println(jogador2.getTelefone());
	 }
}
