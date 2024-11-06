package AvFormativa.desafios;

public class PrincipalDesafio5 {

	public static void main(String[] args) {
		Lobo1 lobo = new Lobo1("Lobo mau", "F","Cinzento");
		Leao leao = new Leao("Simba", "M","Africano");

		lobo.dormir();
		lobo.caminhar();
		lobo.correr();
		lobo.emitirSom();

		leao.dormir();
		leao.caminhar();
		leao.correr();
		leao.emitirSom();

	}

}
