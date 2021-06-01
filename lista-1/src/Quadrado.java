
public class Quadrado {
	
	private double lado;
	
	public Quadrado(double l) {
		this.lado = l;
	}
	
	public void mudarLado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	public double getArea() {
		return this.lado = lado * lado;
	}
}
