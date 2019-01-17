package br.com.bikeshopmanager.model;

public enum MenuEnum {

	// menu principal
	CADASTRO(1, "Cadastro"), MONTAR_BICICLETA(2, "Montar Bicicleta"), SAIR(3, "Sair"),

	// menu secundario cadastro
	CADASTRO_PF(1, "Cadastro PF"), CADASTRO_PJ(2, "Cadastro PJ"), CADASTRO_N(3, "Montar Bicicleta"), VOLTAR(4, "Sair"),

	// menu secundario montar bicicleta
	
	QUADRO(1, "Quadro Bicicleta"), CAMBIO(2, "Câmbio Bicicleta") , SUSPENSAO(3, "Suspensão") , FREIO(4, "Kit freio") , 
	RODA(5, "Roda"), PNEU(6, "Pneu") , ACESSORIOS(7, "Kit Acessórios");
	
	
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
