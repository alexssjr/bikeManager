package br.com.bikeshopmanager.model;

import java.util.List;

public class Bicicleta implements Item {
	String quadro;
	String cambio;

	public String getQuadro() {
		return quadro;
	}

	public void setQuadro(String quadro) {
		this.quadro = quadro;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	private List<Item> itens;

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return 0;
	}

}
