package br.com.bikeshopmanager.main;

import java.util.LinkedList;

import br.com.bikeshopmanager.model.Cambio;
import br.com.bikeshopmanager.model.Item;
import br.com.bikeshopmanager.model.NotaFiscal;
import br.com.bikeshopmanager.model.Roda;

public class MenuNova {
	public void abreMenu() {

		NotaFiscal notaFiscal = new NotaFiscal();
		notaFiscal.setItens(new LinkedList<Item>());

		entraSelecaoCambio(notaFiscal);
		entraSelecaoRoda(notaFiscal);
	}

	private void entraSelecaoCambio(NotaFiscal notaFiscal) {
		notaFiscal.getItens().add(new Cambio());
	}

	private void entraSelecaoRoda(NotaFiscal notaFiscal) {
		notaFiscal.getItens().add(new Roda());
	}

	private void sair() {

	}
}
