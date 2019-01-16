package br.com.bikeshopmanager.main;

import java.util.Arrays;
import java.util.LinkedList;

import br.com.bikeshopmanager.menu.Menu;
import br.com.bikeshopmanager.model.MenuEnum;

public class EntryPoint {

	public static void main(String[] args) {
		LinkedList<MenuEnum> menus = new LinkedList<MenuEnum>();
		menus.addAll(Arrays.asList(MenuEnum.values()));		
		
		Menu menu = new Menu();
		menu.setMenus(menus);

		menu.apresenta();

	}
}
