package fabricaDeBikes;

public class Pessoa {
	String nome;
	String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		boolean semLetra = nome.matches("[a-zA-Z\\s]+");
		if (semLetra) {
			this.nome = nome;
		} else {
			System.out.println("Nome contém caracteres inválidos");
		}
		this.cpf = cpf;
	}
}
