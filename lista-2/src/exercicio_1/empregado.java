package exercicio_1;

public class empregado {
	private int codigo;
	private String nome;
	private String email;
	private float salario;
	
	public empregado(int cod, String nom, String mail, float sal) {
		this.codigo = cod;
		this.nome = nom;
		this.email = mail;
		this.salario = sal;
	}
	
	public void aumentoSalarial(float percentual) {
		this.salario = + this.salario + (this.salario * (percentual/100));
	}
	
	public void setSalario(float salarioNovo) {
		this.salario = salarioNovo;
	}
	
	public float getSalario() {
		return this.salario;
	}
	public String getNome() {
		return this.nome;
	}
	
}
