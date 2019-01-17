package br.com.bikeshopmanager.model;

public enum QuadroEnum {
	
	// Opções de Quadro
	Q1(1, "Quadro 1", 150.0), Q2(2, "Quadro 2", 200.0), Q3(3, "", 300.0);
	
	Integer codigo;
	String nome;
	Double preco;
	
	private QuadroEnum(Integer codigo, String nome, Double preco){
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}

	public Integer getCodigo() {
		return codigo;
	}


	public String getNome() {
		return nome;
	}


	public Double getPreco() {
		return preco;
	}
 
}
