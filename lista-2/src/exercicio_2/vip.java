package exercicio_2;

public class vip extends ingresso {
	private float adc;
	
	public vip(float valor, float adc) {
		super(valor);
		this.adc = adc;
	}
	
	public float valorVip() {
		return this.imprimeValor() + this.adc;
	}

}
