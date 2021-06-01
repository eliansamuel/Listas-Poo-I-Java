
public class Bola {
	
	private String cor;
	private double circunferencia;
	private String material;
	
	public Bola(String cor, double cir, String mat) {
		this.cor = cor;
		this.circunferencia = cir;
		this.material = mat;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return this.cor;
	}
}
