package br.com.bikeshopmanager.model;

public enum MenuEnum {

	// menu principal
	CADASTRO(1, "Cadastro"), MONTAR_BICICLETA(2, "Montar Bicicleta"), SAIR(3, "Sair"),

	// menu secundario
	CADASTRO_PF(1, "Cadastro PF"), CADASTRO_PJ(2, "Cadastro PJ"), CADASTRO_N(3, "Montar Bicicleta"), VOLTAR(4, "Sair");

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
