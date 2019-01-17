package br.com.bikeshopmanager.menu;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import br.com.bikeshopmanager.model.MenuEnum;

public class MontarBicicleta {

	private List<MenuEnum> menux;

	public List<MenuEnum> getMenux() {
		return menux;
	}

	public void setMenux(List<MenuEnum> menux) {
		this.menux = menux;
	}

	public static void montagem() {
		
		LinkedList<MenuEnum> listaSecundarioMontagem = new LinkedList<MenuEnum>();
		listaSecundarioMontagem.add(MenuEnum.QUADRO);
		listaSecundarioMontagem.add(MenuEnum.CAMBIO);
		listaSecundarioMontagem.add(MenuEnum.SUSPENSAO);
		listaSecundarioMontagem.add(MenuEnum.FREIO);
		listaSecundarioMontagem.add(MenuEnum.RODA);
		listaSecundarioMontagem.add(MenuEnum.PNEU);
		listaSecundarioMontagem.add(MenuEnum.ACESSORIOS);

		MontarBicicleta menuMontagem = new MontarBicicleta();
		menuMontagem.setMenux(listaSecundarioMontagem);
		
		for (MenuEnum menuEnum : listaSecundarioMontagem) {
			System.out.println(menuEnum.getCodigo() + "-" + menuEnum.getNome());
		}

		
		System.out.println("Implementar método");
		Scanner selecao = new Scanner(System.in);
		//x = selecao.nextInt();

		System.out.println("Implementar método");

	}

}
