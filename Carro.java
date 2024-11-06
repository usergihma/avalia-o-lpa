package AvFormativa.desafios;

public class Carro {
	private String modelo;
	private Motor motor;
	
	public Carro(String modelo, String motor) {
		this.modelo = modelo;
		this.motor = new Motor(motor);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMotor() {
		return motor.getTipo();
	}
}
