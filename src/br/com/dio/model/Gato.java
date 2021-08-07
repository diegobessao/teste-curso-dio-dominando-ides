package br.com.dio.model;

public class Gato {
	privete string nome;
	private string cor;
	private integer idade;
	
	public Gato() {	}

	public Gato(privete string, br.com.dio.model.string cor, integer idade) {
		this.string = string;
		this.cor = cor;
		this.idade = idade;
	}

	public privete getString() {
		return string;
	}

	public void setString(privete string) {
		this.string = string;
	}

	public string getCor() {
		return cor;
	}

	public void setCor(string cor) {
		this.cor = cor;
	}

	public integer getIdade() {
		return idade;
	}

	public void setIdade(integer idade) {
		this.idade = idade;
	}
	
	
	
	
	/*public Gato(String nome, String cor, Integer idade) {
		this.nome  = nome;
		this.cor   = cor;
		this.idade = idade;
	}*/
}
