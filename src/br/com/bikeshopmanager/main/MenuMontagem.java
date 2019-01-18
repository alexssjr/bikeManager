package br.com.bikeshopmanager.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import br.com.bikeshopmanager.model.Bicicleta;
import br.com.bikeshopmanager.model.Cambio;
import br.com.bikeshopmanager.model.Item;
import br.com.bikeshopmanager.model.Marca;
import br.com.bikeshopmanager.model.NotaFiscal;
import br.com.bikeshopmanager.model.Quadro;
import br.com.bikeshopmanager.model.Roda;

public class MenuMontagem {

	public void abreMenuMontagem() {
		NotaFiscal notaFiscal = new NotaFiscal();
		notaFiscal.setItens(new LinkedList<Item>());
		//System.out.println("Iniciando a montagem da nota fiscal...");

		//System.out.println("Iniciando a montagem da bicicleta...");

		System.out.println("[1]- Selecionar quadro:");
		System.out.println("[2]- Selecionar câmbio:");
		System.out.println("[3]- Finalizar montagem:"); 
		System.out.print("Entre com a seleção: ");

		Scanner selecao = new Scanner(System.in);
		int x = 0;
		x = selecao.nextInt();
		switch (x) {
		case 1:
			System.out.println("Entrou no 1");
			entraSelecaoQuadro();;
			break;
		case 2:
			System.out.println("Entrou no 2");
			entraSelecaoCambio();
			break;
		case 3:
			finalizar();
			break;
		default:
			System.out.println("Entre com uma seleção válida!");
			abreMenuMontagem();
			break;
		}
		
		System.out.println("Finalizou e mostrou a bicicleta.");
//		entraSelecaoCambio(notaFiscal);
//		entraSelecaoRoda(notaFiscal);
	}

	private void entraSelecaoQuadro() {
		Marca marca =  new Marca();
		marca.nome ="OGGI";
		List<Quadro> lista = new ArrayList<>();
		Quadro quadro1 =  new Quadro();
		quadro1.setMarca(marca);
		quadro1.setDesc("tamanho 17");
		quadro1.codigo = 1;
		
		Quadro quadro2 =  new Quadro();
		quadro2.setMarca(marca);
		quadro2.setDesc("tamanho 19");
		quadro2.codigo = 2;
		
		lista.add(quadro1);
		lista.add(quadro2);
		
		for (Quadro quadro : lista) {
			
			System.out.println("["+quadro.codigo+"]"+ quadro.getDesc() +" " + quadro.getMarca().nome);
		}
		
		Scanner selecao = new Scanner(System.in);
		int x = 0;
		x = selecao.nextInt();
		
		
		//Quadro menuQuadro = new Quadro();
		//menuQuadro.abreMenuQuadro();
	}

	//private void entraSelecaoCambio(NotaFiscal notaFiscal) {
	private void entraSelecaoCambio() {

		Cambio menuCambio = new Cambio();
		menuCambio.abreMenuCambio();
		//notaFiscal.getItens().add(new Cambio());
	}

	/*
	 * private void entraSelecaoRoda(NotaFiscal notaFiscal) {
	 * 
	 * notaFiscal.getItens().add(new Roda()); }
	 */

	private void finalizar() {
		Bicicleta bicicleta = new Bicicleta();
		//quadro.
		//cambio.
		//listar
	}
}
