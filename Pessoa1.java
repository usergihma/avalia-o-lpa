package AvFormativa.desafios;

public class Pessoa1 {
	private String nome; 		//Atributos 
	private int idade;
	
	Pessoa1 (){
		
	}	
	Pessoa1 (String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

}
