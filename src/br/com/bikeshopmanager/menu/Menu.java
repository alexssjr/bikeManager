package br.com.bikeshopmanager.menu;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import br.com.bikeshopmanager.exception.DocumentoException;
import br.com.bikeshopmanager.model.MenuEnum;

public class Menu {

	private List<MenuEnum> menus;

	public List<MenuEnum> getMenus() {
		return menus;
	}

	public void setMenus(List<MenuEnum> menus) {
		this.menus = menus;
	}

	public void apresenta() {
		for (MenuEnum menuEnum : menus) {
			System.out.println(menuEnum.getCodigo() + "-" + menuEnum.getNome());
		}

		Scanner sc1 = new Scanner(System.in);

		try {

			Integer textoString = sc1.nextInt();

			switch (textoString) {
			case 1:
				System.out.println("Opção 1");
				LinkedList<MenuEnum> listaSecundarioPrincial = new LinkedList<MenuEnum>();
				listaSecundarioPrincial.add(MenuEnum.CADASTRO_PF);
				listaSecundarioPrincial.add(MenuEnum.CADASTRO_PJ);
				listaSecundarioPrincial.add(MenuEnum.SAIR);
				
				Menu menuSecondario = new Menu();
				menuSecondario.setMenus(listaSecundarioPrincial);
				menuSecondario.apresenta();
				
				break;
			case 3:
				
				
				System.out.println("Tchau");
				break;
			default:
				throw new DocumentoException("Documento Digital inválido");
//				break;
			}

		} catch (InputMismatchException e) {
			System.out.println("Digitou um numero valido");
//			e.printStackTrace();

		} catch (DocumentoException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			//
			System.out.println(e.getMessage());
		} finally {
			apresenta();
		}

	}
}
