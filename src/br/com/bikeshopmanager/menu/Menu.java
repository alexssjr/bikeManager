/*package br.com.bikeshopmanager.menu;

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
	
	Scanner sc1 = new Scanner(System.in);
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

				
			case 2:
				
				LinkedList<MenuEnum> listaSecundarioMontagem = new LinkedList<MenuEnum>();
				listaSecundarioMontagem.add(MenuEnum.QUADRO);
				listaSecundarioMontagem.add(MenuEnum.CAMBIO);
				listaSecundarioMontagem.add(MenuEnum.SUSPENSAO);
				listaSecundarioMontagem.add(MenuEnum.FREIO);
				listaSecundarioMontagem.add(MenuEnum.RODA);
				listaSecundarioMontagem.add(MenuEnum.PNEU);
				listaSecundarioMontagem.add(MenuEnum.ACESSORIOS);

				Menu menuMontagem = new Menu();
				menuMontagem.setMenus(listaSecundarioMontagem);
				menuMontagem.apresenta();

				// Scanner sc2 = new Scanner(System.in);
				Integer textoString2 = sc1.nextInt();
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
			
			System.out.println(e.getMessage());
		} finally {
//			 apresenta();
		}
		System.exit(0);
	}
}*/
