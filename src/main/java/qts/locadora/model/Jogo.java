package qts.locadora.model;

public class Jogo {
	private String nome;
	
	/*
	 * utilizar como tipoprimitivo 
	 * fazer getter eand setter
	 * fazer construtor
	 * */
	
	private double locacao;
	private int estoque;
	public Jogo(String nome, double locacao, int estoque) {
		super();
		this.nome = nome;
		this.locacao = locacao;
		this.estoque = estoque;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getLocacao() {
		return locacao;
	}
	public void setLocacao(double locacao) {
		this.locacao = locacao;
	}
	
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

}
