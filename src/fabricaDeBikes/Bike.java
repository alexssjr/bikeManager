package fabricaDeBikes;

public class Bike {

	// ATRIBUTOS

	private String freio;
	private String Cambio;
	private String Quadro;
	private double preco;
	private double tamanho;
	private String suspensao;
	private String SelimGuidão;
	private String roda;
	private String pneu;

	// GETTERS AND SETTERS

	public String getSuspensao() {
		return suspensao;
	}

	public void setSuspensao(String suspensao) {
		this.suspensao = suspensao;
	}

	public String getSelimGuidão() {
		return SelimGuidão;
	}

	public void setSelimGuidão(String selimGuidão) {
		SelimGuidão = selimGuidão;
	}

	public String getRoda() {
		return roda;
	}

	public void setRoda(String roda) {
		this.roda = roda;
	}

	public String getPneu() {
		return pneu;
	}

	public void setPneu(String pneu) {
		this.pneu = pneu;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getFreio() {
		return freio;
	}

	public void setFreio(String freio) {
		this.freio = freio;
	}

	public String getCambio() {
		return Cambio;
	}

	public void setCambio(String cambio) {
		Cambio = cambio;
	}

	public String getQuadro() {
		return Quadro;
	}

	public void setQuadro(String quadro) {
		Quadro = quadro;
	}

	// MÉTODOS
	 
	public String addquadro(int tipo) {
		if (tipo == 1) {
			this.preco += 100;
			return ("Quadro de Alumínio -- R$ 100,00.");
		}
		if (tipo == 2) {
			this.preco += 50;
			return ("Quadro de Ferro R$ -- 50,00.");
		}
		if (tipo == 3) {
			this.preco += 500;
			return ("Quadro de fibra de Carbono -- R$ 500,00");
		} else {
			return ("Digite um tipo válido, letras minúscululas e sem acentos (fibra de carbono, ferro ou aluminio)");

		}

	}

	public String addfreio(int tipo) {
		if (tipo == 1) {
			this.preco += 100;
			return ("Freios à disco hidráulico -- R$ 100,00.");
		}
		if (tipo == 2) {
			this.preco += 50;
			return ("Freios Cantilever -- R$  50,00.");
		}
		if (tipo == 3) {
			this.preco += 500;
			return ("Freios V-Brake -- R$ 500,00");
		}

		if (tipo == 4) {
			this.preco += 100;
			return ("Freios à disco mecânico -- R$ 100,00.");
		} else {
			return ("Digite um tipo válido, letras minúscululas e sem acentos (discohidraulico, discomecanico, vbrake ou cantilever)");

		}

	}

	public String addcambio(int marchas) {
		if (marchas == 18) {
			this.preco += 300;
			return ("Cambio de 18 marchas -- R$ 300,00");
		}
		return ("nada");
	}
}
