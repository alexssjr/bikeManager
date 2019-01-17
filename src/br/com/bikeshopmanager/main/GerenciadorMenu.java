package br.com.bikeshopmanager.main;

public class GerenciadorMenu {

	public void criaMenu() {
		if(true) {
			abreMenuNova();
		}else {
			abreMenuMontagem();
		}

	}

	private void abreMenuNova() {
		MenuNova menuNova =  new MenuNova();
		menuNova.abreMenu();
	}

	private void abreMenuMontagem() {
		MenuMontagem menuMontagem=  new MenuMontagem();
		menuMontagem.abreMenu();
	}

}
