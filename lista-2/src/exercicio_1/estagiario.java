package exercicio_1;

public class estagiario extends empregado {
	private int descontos;
	
	public estagiario(int cod, String nom, String mail, float sal, int qtd) {
		super(cod, nom, mail, sal);
		this.descontos = qtd;
	}
	public void aumentoSalario(float porcentagem) {
		super.setSalario(this.getSalario() + (this.getSalario() * (porcentagem/100)) - this.descontos);
	}

}
