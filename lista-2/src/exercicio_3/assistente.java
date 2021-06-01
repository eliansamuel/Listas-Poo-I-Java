package exercicio_3;

public class assistente extends funcionarios{
	private int matricula;
	
	public assistente(String nome, String endereco, int telefone, String email, int matricula) {
		super(nome, endereco, telefone, email);
		this.matricula = matricula;
	}
	public int getMatricula() {
		return this.matricula;
	}
}
