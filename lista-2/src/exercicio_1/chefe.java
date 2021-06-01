package exercicio_1;

public class chefe extends empregado {
	private float beneficio;
	
	
	public chefe(int cod, String nom, String mail, float sal, float ben) {
		super(cod, nom, mail, sal);
		this.beneficio = ben;
	}
	public void aumentoSalario(int porcentagem) {
		super.setSalario(((this.getSalario() * (porcentagem/100)) + this.beneficio) + this.getSalario());
	}
	
}
