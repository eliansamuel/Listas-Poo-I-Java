package exercicio_5;

public class rica extends pessoa{
	private double dinheiro;
	
	public rica(String nome, int idade, double dinheiro) {
		super(nome, idade);
		this.dinheiro = dinheiro;
	}
	public String getRica() {
		return "comprando tudo que passa no cartão black";
	}
	

}
