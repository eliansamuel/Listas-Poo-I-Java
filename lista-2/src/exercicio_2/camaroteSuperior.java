package exercicio_2;

public class camaroteSuperior extends vip{
	private float adicionalSup;
	private String local;
	
	public camaroteSuperior(float valor, float adc, float adicionalSup, String local) {
		super(valor, adc);
		this.adicionalSup = adicionalSup;
		this.local = local;
	}
	
	public String getLocal(){
		return this.local;
	}
	public float getValorCamaroteSuperior() {
		return this.valorVip() + this.adicionalSup;
	}

}
