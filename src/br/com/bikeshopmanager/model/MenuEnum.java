package br.com.bikeshopmanager.model;

public enum MenuEnum {

	CADASTRO(1, "Cadastro"), 
	MONTAR_BICICLETA(2, "Montar Bicicleta"), 
	SAIR(3, "Sair");

	private Integer codigo;
	private String nome;

	private MenuEnum(Integer codigo, String nome) {
		this.nome = nome;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

}
