package fabricaDeBikes;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {

		// DEFININDO LISTA DE PRODUTOS

		List<String> quadros = new LinkedList<String>();

		List<String> freios = new LinkedList<String>();

		List<String> cambios = new LinkedList<String>();

		List<String> suspensoes = new LinkedList<String>();

		List<String> rodas = new LinkedList<String>();

		List<String> pneus = new LinkedList<String>();
		
		List<String> kitacessorios = new LinkedList<String>();

		quadros.add("1- ksdjbf ");
		quadros.add("2- asdfoihas");
		quadros.add("3- açsdfh");

		freios.add("1 - ");
		freios.add("2 - ");
		freios.add("3 - ");
		freios.add("4 - ");

		cambios.add("1 - ");
		cambios.add("2 - ");
		cambios.add("3 - ");
		cambios.add("4 - ");
		cambios.add("5 - ");

		suspensoes.add("1 - ");
		suspensoes.add("2 - ");
		suspensoes.add("3 - ");

		rodas.add("1 - ");
		rodas.add("2 - ");
		rodas.add("3 - ");

		pneus.add("1 - ");
		pneus.add("2 - ");
		pneus.add("3 - ");
		
		kitacessorios.add("1 - ");
		kitacessorios.add("2 - ");
		kitacessorios.add("3 - ");
		kitacessorios.add("4 - ");
		
		
		

		// INICIO DA MONTAGEM

		System.out.println("Bem vindo ao sistema!");
		System.out.println("Entre com a opção para iniciar o sistema:");

		@SuppressWarnings("resource")
		Scanner selecao = new Scanner(System.in);
		int opcao = 0;
		boolean var = true;

		do {
			System.out.println("[1] Pessoa Física");
			System.out.println("[2] Empresa");
			System.out.println("[3] Sair");
			System.out.print("Seleciona a opção: ");
			opcao = selecao.nextInt();

			try {				

			switch (opcao) {
			case 1:
				System.out.println("Insira seus dados.");
				Pessoa p1 = new Pessoa();
				System.out.println("Entre com seu nome: ");
				String nome = selecao.next();

				while (!nome.matches("[a-zA-Z\\s]+")) {
					System.out.println("Nome contém caracteres inválidos");
					nome = selecao.next();
				}
				p1.setNome(nome);
				System.out.println("Entre com seu cpf: ");
				String cpf = selecao.next();
				while (!cpf.matches("[0-9]{3}\\.?[0-9]{3}\\.?[0-9]{3}\\-?[0-9]{2}")) {
					System.out.println("Nome contém caracteres inválidos");
					cpf = selecao.next();
				}
				p1.setCpf(cpf);
				System.out.println("Iniciando montagem: ");
				Bike b = new Bike();

				System.out.println("Escolha o Quadro: ");
				System.out.println(quadros);
				b.addQuadro(selecao.nextInt());

				System.out.println("Escolha o Freio desejado: ");
				System.out.println(freios);
				b.addFreio(selecao.nextInt());

				System.out.println("Escolha o Cambio desejado: ");
				System.out.println(cambios);
				b.addCambio(selecao.nextInt());

				System.out.println("Escolha a Suspensão desejada: ");
				System.out.println(suspensoes);
				b.addSuspensao(selecao.nextInt());

				System.out.println("Escolha a Roda desejada: ");
				System.out.println(rodas);
				b.addRoda(selecao.nextInt());

				System.out.println("Escolha o Pneu desejado: ");
				System.out.println(pneus);
				b.addPneu(selecao.nextInt());
				
				System.out.println("Escolha o Kit de Acessórios desejado: ");
				System.out.println(kitacessorios);
				b.addKitacessorios(selecao.nextInt());
				
				//Impressão da nota fiscal
				
				System.out.println("!!!!Nota Fiscal!!!! \nComprador: "+ p1.getNome() + "\nCNPJ: " 
				+ p1.getCpf() + "\n!!!!Relação de Peças!!!!" + "\nQuadro: " + b.getQuadro() + "\nFreio: " 
						+ b.getFreio() + "\nCâmbio: "+ b.getCambio() + "\nSuspensão: " + b.getSuspensao() 
						+ "\nRoda: " + b.getRoda() + "\nPneus: " + b.getPneu() + "\nKit de Acessórios: " 
						+ b.getKitacessorios() + "\nPreço final: R$" + b.getPreco() + "\nObrigado pela preferência!");

				var = false;
				break;
			case 2:
				System.out.println("Compra empresarial");
				Empresa e1 = new Empresa();
				System.out.println("Qual o nome da empresa: ");
				String nomeEmpresa = selecao.next();

				while (!nomeEmpresa.matches("[a-zA-Z\\s]+")) {
					System.out.println("Nome contém caracteres inválidos");
					nomeEmpresa = selecao.next();
				}
				e1.setNome(nomeEmpresa);
				System.out.println("Entre com seu cnpj: ");
				String cnpj = selecao.next();

				while (!cnpj.matches("[0-9]+")) {
					System.out.println("Nome contém caracteres inválidos");
					cnpj = selecao.next();
				}

				e1.setCnpj(cnpj);
				System.out.println("Iniciando montagem: ");
				Bike b1 = new Bike();

				System.out.println("Escolha o Quadro: ");
				System.out.println(quadros);
				b1.addQuadro(selecao.nextInt());

				System.out.println("Escolha o Freio desejado: ");
				System.out.println(freios);
				b1.addFreio(selecao.nextInt());

				System.out.println("Escolha o Cambio desejado: ");
				System.out.println(cambios);
				b1.addCambio(selecao.nextInt());

				System.out.println("Escolha a Suspensão desejada: ");
				System.out.println(suspensoes);
				b1.addSuspensao(selecao.nextInt());

				System.out.println("Escolha a Roda desejada: ");
				System.out.println(rodas);
				b1.addRoda(selecao.nextInt());

				System.out.println("Escolha o Pneu desejado: ");
				System.out.println(pneus);
				b1.addPneu(selecao.nextInt());
				
				System.out.println("Escolha o Kit de Acessórios desejado: ");
				System.out.println(kitacessorios);
				b1.addKitacessorios(selecao.nextInt());
				
				
				
				//Impressão da nota fiscal
				
				System.out.println("!!!!Nota Fiscal!!!! \nComprador: "+ e1.getNome() + "\nCNPJ: " 
				+ e1.getCnpj() + "\n!!!!Relação de Peças!!!!" + "\nQuadro: " + b1.getQuadro() + "\nFreio: " 
						+ b1.getFreio() + "\nCâmbio: "+ b1.getCambio() + "\nSuspensão: " + b1.getSuspensao() 
						+ "\nRoda: " + b1.getRoda() + "\nPneus: " + b1.getPneu() + "\nKit de Acessórios: " 
						+ b1.getKitacessorios() + "\nPreço final: R$" + b1.getPreco() + "\nObrigado pela preferência!");
				
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
			} catch (Exception e) {
				System.out.println("opcao invalida, erro: " + e);
			}

		} while (var);
		
		
	}
}
