package exercicio_2;

public class camaroteInferior extends vip {
	private String local;
	
	camaroteInferior(float valor, float adc, String local) {
		super(valor, adc);

		this.local = local;
	}
	
	public String getLocal() {
		return this.local;
	}
	
	public float getValorCamaroteInferior() {
		return this.valorVip();
	}

}
