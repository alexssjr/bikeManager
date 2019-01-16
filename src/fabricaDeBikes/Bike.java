package fabricaDeBikes;

public class Bike {

	// ATRIBUTOS

	private String freio;
	private String cambio;
	private String quadro;
	private double preco;
	private double tamanho;
	private String suspensao;
	private String roda;
	private String pneu;
	private String kitacessorios;

	// GETTERS AND SETTERS

	public String getKitacessorios() {
		return kitacessorios;
	}

	public void setKitacessorios(String kitacessorios) {
		this.kitacessorios = kitacessorios;
	}

	public String getSuspensao() {
		return suspensao;
	}

	public void setSuspensao(String suspensao) {
		this.suspensao = suspensao;
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
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public String getQuadro() {
		return quadro;
	}

	public void setQuadro(String quadro) {
		this.quadro = quadro;
	}

	// MÉTODOS

	public String addQuadro(int tipo) {
		if (tipo == 1) {
			this.preco += 100;
			this.quadro = "Alumínio";
			return ("Quadro de Alumínio -- R$ 100,00.");

		}
		if (tipo == 2) {
			this.preco += 50;
			this.quadro = "Ferro";

			return ("Quadro de Ferro R$ -- 50,00.");
		}
		if (tipo == 3) {
			this.preco += 500;
			this.quadro = "Fibra de Carbono";
			return ("Quadro de fibra de Carbono -- R$ 500,00");
		} else {
			return ("Digite o NÚMERO da opção desejada!");

		}

	}

	public String addFreio(int tipo) {
		if (tipo == 1) {
			this.preco += 100;
			this.freio = "Freios à disco hidráulico";
			return ("Freios à disco hidráulico -- R$ 100,00.");
		}
		if (tipo == 2) {
			this.preco += 50;
			this.freio = "Freios Cantilever";
			return ("Freios Cantilever -- R$  50,00.");
		}
		if (tipo == 3) {
			this.preco += 500;
			this.freio = "Freios V-Brake";
			return ("Freios V-Brake -- R$ 500,00");
		}

		if (tipo == 4) {
			this.preco += 100;
			this.freio = "Freios Cantilever";
			return ("Freios à disco mecânico -- R$ 100,00.");
		} else {
			return ("Digite o NÚMERO da opção desejada!");

		}

	}

	public String addCambio(int marchas) {
		if (marchas == 1) {
			this.preco += 300;
			this.cambio = "Cambio1";
			return ("Cambio de 18 marchas -- R$ 300,00");
		}

		if (marchas == 2) {
			this.preco += 300;
			this.cambio = "Cambio2";
			return ("Cambio de 18 marchas -- R$ 300,00");
		}
		if (marchas == 3) {
			this.preco += 300;
			this.cambio = "Cambio3";
			return ("Cambio de 18 marchas -- R$ 300,00");
		}
		if (marchas == 4) {
			this.preco += 300;
			this.cambio = "Cambio4";
			return ("Cambio de 18 marchas -- R$ 300,00");
		}
		if (marchas == 5) {
			this.preco += 300;
			this.cambio = "Cambio5";
			return ("Cambio de 18 marchas -- R$ 300,00");
		}
		return ("Digite o NÚMERO da opção desejada!");
	}

	public String addSuspensao(int s) {
		if (s == 1) {
			this.preco += 300;
			this.suspensao = "Suspenção1";
			return ("SUSP -- R$ 300,00");
		}
		if (s == 2) {
			this.preco += 300;
			this.suspensao = "Suspenção4";
			return ("SUSP -- R$ 300,00");
		}
		if (s == 3) {
			this.preco += 300;
			this.suspensao = "Suspenção3";
			return ("SUSP -- R$ 300,00");
		}
		if (s == 4) {
			this.preco += 300;
			this.suspensao = "Suspenção4";
			return ("SUSP -- R$ 300,00");
		}
		if (s == 5) {
			this.preco += 300;
			this.suspensao = "Suspenção5";
			return ("SUSP -- R$ 300,00");
		} else {
			return ("Digite o NÚMERO da opção desejada!");
		}

	}

	public String addRoda(int r) {
		if (r == 1) {
			this.preco += 300;
			this.roda = "Roda1";
			return ("RODA -- R$ 300,00");
		}
		if (r == 2) {
			this.preco += 300;
			this.roda = "Roda2";
			return ("RODA -- R$ 300,00");
		}
		if (r == 3) {
			this.preco += 300;
			this.roda = "Roda3";
			return ("RODA -- R$ 300,00");
		} else {
			return ("Digite o NÚMERO da opção desejada!");
		}

	}

	public String addPneu(int p) {
		if (p == 1) {
			this.preco += 300;
			this.pneu = "Pneu1";
			return ("PNEU -- R$ 300,00");
		}
		if (p == 2) {
			this.preco += 300;
			this.pneu = "Pneu2";
			return ("PNEU -- R$ 300,00");
		}
		if (p == 3) {
			this.preco += 300;
			this.pneu = "Pneu3";
			return ("PNEU -- R$ 300,00");
		} else {
			return ("Digite o NÚMERO da opção desejada!");
		}

	}

	public String addKitacessorios(int k) {
		if (k == 1) {
			this.preco += 300;
			this.kitacessorios = "kit1";
			return ("kit1 -- R$ 300,00");
		}

		if (k == 2) {
			this.preco += 300;
			this.kitacessorios = "kit2";
			return ("kit2 -- R$ 300,00");
		}
		if (k == 3) {
			this.preco += 300;
			this.kitacessorios = "kit3";
			return ("kit3 -- R$ 300,00");
		}
		if (k == 4) {
			this.preco += 300;
			this.kitacessorios = "kit4";
			return ("kit4 -- R$ 300,00");
		}
		if (k == 5) {
			this.preco += 300;
			this.kitacessorios = "kit5";
			return ("kit5 -- R$ 300,00");
		} else {
			return ("Digite o NÚMERO da opção desejada!");
		}
	}
}
