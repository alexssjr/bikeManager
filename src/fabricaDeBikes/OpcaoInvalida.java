package fabricaDeBikes;

public class OpcaoInvalida extends Exception{
	
	private int opcao;
	
	public OpcaoInvalida(int opcao) {
		this.opcao = opcao;
		
	}
	
	@Override
	public String toString() {
		return "Opção" + this.opcao + "invalida";
	}
	
}
