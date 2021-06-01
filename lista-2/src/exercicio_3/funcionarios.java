package exercicio_3;

public class funcionarios {
	private String nome;
	private String endereco;
	private int telefone;
	private String email;
	
	public funcionarios(String nome, String end, int tel, String email) {
		this.nome = nome;
		this.endereco = end;
		this.telefone = tel;
		this.email = email;	
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public int getTelefone() {
		return this.telefone;
	}
	
	public String getEmail() {
		return this.email;
	}

}
