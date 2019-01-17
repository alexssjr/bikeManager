package br.com.bikeshopmanager.main;

import java.util.Scanner;

import br.com.bikeshopmanager.menu.MontarBicicleta;

public class Entrada {

	public static void main(String[] args) {
		
		MontarBicicleta montadorBicicleta = new MontarBicicleta();
		
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
			montadorBicicleta.montagem();
			
			System.out.println("Entrou na montagem");

			break;
		case 3:
			System.out.println("SAIU");

		default:
			break;
		}
	}
}
