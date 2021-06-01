
public class Bichinho_Virtual {
	
	private String nome;
	private int fome, saude, idade;
	
	Bichinho_Virtual(String nome, int fome, int saude, int idade) {
		this.nome = nome;
		this.fome = fome;
		this.saude = saude;
		this.idade = idade;
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getFome() {
		return this.fome;
	}	
	
	public int getSaude() {
		return this.saude;
	}	
	
	public int getIdade() {
		return this.idade;
	}	
	public String getHumor() {
		if (this.saude == 1 && this.fome == 0)
			return "muito Happy! ";
		if (this.saude == 1 && this.fome == 1)
			return "com uma fominha!";
		if (this.saude == 0 && this.fome == 0)
			return "não tão saldável assim! ";
		if (this.saude == 0 && this.fome == 1)
			return "está prontinho para bater as botas!";
		return "E morreu";
	}
	
	public void fome(int fome) {
		this.fome = fome;
	
	}
	
	public void saude(int saude) {
		this.saude = saude;
	}
	
}
