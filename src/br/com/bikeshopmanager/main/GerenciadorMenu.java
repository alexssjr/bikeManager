package br.com.bikeshopmanager.main;

import java.util.Scanner;

public class GerenciadorMenu {

	public void criaMenu() {
		System.out.println("Bem vindo ao sistema!");
		System.out.println("[1]-Listar bicicleta:");
		System.out.println("[2]-Montar bicicleta:");
		System.out.print("Entre com a seleção: ");

		Scanner selecao = new Scanner(System.in);
		int x = 0;
		x = selecao.nextInt();

		switch (x) {
		case 1:
			System.out.println("Entrou no 1");
			abreMenuNova();
			break;
		case 2:
			System.out.println("Entrou no 2");
			abreMenuMontagem();
			break;
		default:
			System.out.println("Entre com uma seleção válida!");
			criaMenu();
			break;
		}

	}

	private void abreMenuNova() {
		MenuNova menuNova = new MenuNova();
		menuNova.abreMenu();
	}

	private void abreMenuMontagem() {
		MenuMontagem menuMontagem = new MenuMontagem();
		menuMontagem.abreMenuMontagem();
	}

}
