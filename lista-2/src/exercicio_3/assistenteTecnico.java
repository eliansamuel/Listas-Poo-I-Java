package exercicio_3;

public class assistenteTecnico extends assistente{
	private float bonus;
	
	public assistenteTecnico(String nome, String endereco, int telefone, String email, int matricula, float bonus) {
		super(nome, endereco, telefone, email, matricula);
		this.bonus = bonus;
	}
	
	public float getBonus() {
		return this.bonus;
	}

}
