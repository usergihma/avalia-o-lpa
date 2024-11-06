package AvFormativa.desafios;

public class PessoaFisica extends Pessoa2 {

	private String cpf;
	private String rg;
	
	public PessoaFisica( String nome, String telefone, String cpf, String rg) {
		super(nome,telefone);
		this.cpf = cpf;
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
}
