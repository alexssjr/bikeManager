package br.com.bikeshopmanager.model;

public enum CambioEnum {
	
	// Opções de Câmbio
	C1(1, "Câmbio 1", 150.0), C2(2, "Câmbio 2", 200.0), C3(3, "Câmbio 3", 300.0);
	
	Integer codigo;
	String nome;
	Double preco;
	
	private CambioEnum(Integer codigo, String nome, Double preco){
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