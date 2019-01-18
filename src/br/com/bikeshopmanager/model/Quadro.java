package br.com.bikeshopmanager.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Quadro implements Item {

	public String desc;
	public Marca marca;
	public int codigo;

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	private List<Bicicleta> itens;

	public List<Bicicleta> getItens() {
		return itens;
	}

	public void setItens(List<Bicicleta> itens) {
		this.itens = itens;
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void abreMenuQuadro() {
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
//		lista.add("Corratec");
//		lista.add("Cannondale");
//		lista.add("Meriva");
		/*
		 * // lista.add("Specialized"); Comparator<String> comparador = new
		 * Comparator<String>() { public int compare(String s1, String s2) { return
		 * Integer.compare(s1.length(), s2.length()); } }; Collections.sort(lista,
		 * comparador);
		 */
		
		for (Quadro quadro : lista) {
			
			System.out.println("["+quadro.codigo+"]"+ quadro.getDesc() +" " + quadro.getMarca().nome);
		}
		
		Scanner selecao = new Scanner(System.in);
		int x = 0;
		x = selecao.nextInt();
		
//		for (Quadro quadro : lista) {
//			if(quadro.codigo == x) {
//				nota.add(quadro);
//				break;
//			}
//		}
	}

}
