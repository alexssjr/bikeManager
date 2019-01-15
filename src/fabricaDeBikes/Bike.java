package fabricaDeBikes;

public class Bike {
	
	private String freio;
	private String Cambio;
	private String Quadro;
	private double preco;
	
	public String addquadro(String tipo) {
		if (tipo == "aluminio") {
			this.preco += 100;
			return ("Quadro de Alumínio -- R$ 100,00.");
		}
		if (tipo == "ferro") {
			this.preco += 50;
			return ("Quadro de Ferro R$ -- 50,00.");
		}
		if (tipo == "fibra de carbono") {
			this.preco += 500;
			return ("Quadro de fibra de Carbono -- R$ 500,00");
		} else {
			return ("Digite um tipo válido, letras minúscululas e sem acentos (fibra de carbono, ferro ou aluminio)");
			
		}		
		
	}
	
	public String addfreio(String tipo) {
		if (tipo == "discohidraulico") {
			this.preco += 100;
			return ("Freios à disco hidráulico -- R$ 100,00.");
		}
		if (tipo == "cantilever") {
			this.preco += 50;
			return ("Freios Cantilever -- R$  50,00.");
		}
		if (tipo == "vbrake") {
			this.preco += 500;
			return ("Freios V-Brake -- R$ 500,00");
		}
		
		if (tipo == "discomecanico") {
			this.preco += 100;
			return ("Freios à disco mecânico -- R$ 100,00.");
		} else {
			return ("Digite um tipo válido, letras minúscululas e sem acentos (discohidraulico, discomecanico, vbrake ou cantilever)");
						
		}
		
	}
	
	public String addcambio(int marchas) {
		if (marchas == 18) {
			this.preco += 300;
			return("Cambio de 18 marchas -- R$ 300,00");
		}
		return("nada");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	

}
