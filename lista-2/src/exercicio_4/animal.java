package exercicio_4;

public class animal {
	private String nome;
	private String raca;
	
	animal(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
	
	}
	public String getRaca() {
		return this.raca;
	}
	
	public String getNome() {
		return this.nome;
	}
	public String getAndar() {
		return " está caminhado...";
	}
	public String getParado() {
		return " está parado...";
	}

}
