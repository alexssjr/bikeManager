package br.com.bikeshopmanager.main;

import java.util.Arrays;
import java.util.LinkedList;

import br.com.bikeshopmanager.menu.Menu;
import br.com.bikeshopmanager.model.MenuEnum;

public class EntryPoint {

	public static void main(String[] args) {
		LinkedList<MenuEnum> listaMenuPrincial = new LinkedList<MenuEnum>();
		listaMenuPrincial.add(MenuEnum.CADASTRO);		
		listaMenuPrincial.add(MenuEnum.MONTAR_BICICLETA);
		listaMenuPrincial.add(MenuEnum.SAIR);
		Menu menuPrincipal = new Menu();
		menuPrincipal.setMenus(listaMenuPrincial);
		menuPrincipal.apresenta();
		
		

		

	}
}
