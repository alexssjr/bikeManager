package br.com.bikeshopmanager.menu;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import br.com.bikeshopmanager.model.CambioEnum;
import br.com.bikeshopmanager.model.MenuEnum;
import br.com.bikeshopmanager.model.QuadroEnum;

public class MontarBicicleta {

	private static Double precoCambio;
	private static Double precoQuadro;
	private static double total;

	private List<MenuEnum> menux;

	public List<MenuEnum> getMenux() {
		return menux;
	}

	public void setMenux(List<MenuEnum> menux) {
		this.menux = menux;
	}

	public static int montagem() {

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

		int x = 0;
		System.out.print("Entre com a seleção: ");
		Scanner selecao = new Scanner(System.in);
		x = selecao.nextInt();

		if (x == 1) {
			System.out.println("Vamos montar o quadro");
			addQuadro();
		}
		if (x == 2) {
			System.out.println("Vamos montar o cambio");
			addCambio();
		}
		if (x == 3) {
			System.out.println("vamos montar a suspensão");
		}

		System.out.println("Implementar método");
		return 0;
	}

	public static void addQuadro() {
		LinkedList<QuadroEnum> listaAdicionarQuadro = new LinkedList<QuadroEnum>();
		listaAdicionarQuadro.add(QuadroEnum.Q1);
		listaAdicionarQuadro.add(QuadroEnum.Q2);
		listaAdicionarQuadro.add(QuadroEnum.Q3);

		// MontarBicicleta addQuadro = new MontarBicicleta();
		// addQuadro.setMenux(listaAdicionarQuadro);

		for (QuadroEnum quadroEnum : listaAdicionarQuadro) {
			System.out.println(quadroEnum.getCodigo() + "-" + quadroEnum.getNome() + " -" + quadroEnum.getPreco());
			precoQuadro = quadroEnum.getPreco();
		}
	}

	public static void addCambio() {
		LinkedList<CambioEnum> listaAdicionarCambio = new LinkedList<CambioEnum>();
		listaAdicionarCambio.add(CambioEnum.C1);
		listaAdicionarCambio.add(CambioEnum.C2);
		listaAdicionarCambio.add(CambioEnum.C3);

		for (CambioEnum cambioEnum : listaAdicionarCambio) {
			System.out.println(cambioEnum.getCodigo() + "-" + cambioEnum.getNome() + " -" + cambioEnum.getPreco());
			precoCambio = cambioEnum.getPreco();
		}
	}
	
	public static void valorFinal() {
		 total = precoCambio + precoQuadro; 
		 System.out.println();
	}
	

}
