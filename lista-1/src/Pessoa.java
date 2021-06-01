
public class Pessoa {
	
	private String nome;
	private int idade;
	private double altura, peso;
	
	public Pessoa(String nome, int idade, double altura, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;

	}
	public void envelhecerPessoa(int idade) {
		if (idade > 21)
			this.altura += 0.05;
		this.idade = idade;

	}

	public void engordarPessoa(double peso) {
		this.peso = this.peso + peso;
	}
	
	public void emagrescerPessoa(double peso) {
		this.peso = this.peso - peso;
	}
	
	public void crescerPessoa(double metros) {
		this.altura = this.altura + metros;
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public double getPeso() {
		return this.altura;
	}
	
}