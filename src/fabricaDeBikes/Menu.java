package fabricaDeBikes;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		System.out.println("Bem vindo ao sistema!");
		System.out.println("Entre com a opção para iniciar o sistema:");

		Scanner selecao = new Scanner(System.in);
		int opcao = 0;
		boolean var = true;

		do {
			System.out.println("[1] Pessoa Física");
			System.out.println("[2] Empresa");
			System.out.println("[3] Sair");
			System.out.print("Seleciona a opção: ");
			opcao = selecao.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("opcao 1 ---");
				Pessoa p1 = new Pessoa();
				System.out.println("Entre com seu nome: ");
				String nome = selecao.next(); 
				
				while(!nome.matches("[a-zA-Z\\s]+")) {
					System.out.println("Nome contém caracteres inválidos");
					nome = selecao.next();
				}
				
				p1.setNome(nome);
				
				System.out.println("Entre com seu cpf: ");
				String cpf = selecao.next();
				while(!cpf.matches("[0-9]+")) {
					System.out.println("Nome contém caracteres inválidos");
					cpf = selecao.next();
				}
				
				
				p1.setCpf(selecao.next());
				
				var = false;
				break;
			case 2:
				System.out.println("opcao 2 ***");
				Empresa e1 = new Empresa();
				var = false;
				break;
			case 3:
				System.out.println("opcao 3");
				var = false;
				break;
			default:
				System.out.println("opcao invalida");
				break;
			}

		} while (var);
	}
}
