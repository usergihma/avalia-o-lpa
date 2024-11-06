package AvFormativa.desafios;

public class PrincipalDesafio7 {
	
	public static void main(String[] args) {
		
		Motor motor = new Motor("Combustão Interna");
		Carro carro = new Carro("Fusca",motor.getTipo());
		
		System.out.println(carro.getModelo());
		System.out.println(carro.getMotor());
	}
}
