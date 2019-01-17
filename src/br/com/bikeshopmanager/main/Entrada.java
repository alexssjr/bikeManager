package br.com.bikeshopmanager.main;

import java.util.LinkedList;
import java.util.Scanner;

import br.com.bikeshopmanager.menu.Menu;
import br.com.bikeshopmanager.menu.MontarBicicleta;
import br.com.bikeshopmanager.model.MenuEnum;

public class Entrada {

	public static void main(String[] args) {
		System.out.println("Bem Vindo ao Sistema!");
		int x = 0;
		@SuppressWarnings("resource")
		Scanner selecao = new Scanner(System.in);

		System.out.println("[1] - Cadastrar!");
		System.out.println("[2] - Montar Bicicleta!");
		System.out.println("[3] - Sair!");
		System.out.print("Entre com a seleção: ");

		x = selecao.nextInt();

		switch (x) {
		case 1:
			System.out.println("Entrou no cadastro");
			break;
		case 2:
			MontarBicicleta.montagem();;
			System.out.println("Entrou na montagem");

			break;
		case 3:
			System.out.println("SAIU");

		default:
			break;
		}
	}
}
