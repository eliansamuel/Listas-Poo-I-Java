
public class Bomba_de_combustivel {
	private String tipoCombustivel;
	private double valorLitro;
	private double quantidadeCombustivel;
	private double qtd_bomba;
	
	
	public Bomba_de_combustivel(String tipo, double valor, double qtd, double qtd_bomba) {
		this.tipoCombustivel = tipo;
		this.valorLitro = valor;
		this.quantidadeCombustivel = qtd;
		this.qtd_bomba = qtd_bomba;
			
	}
	
	public void porValor(double valor) {
		double qtd = valor / this.valorLitro;
		this.quantidadeCombustivel += qtd;
		this.qtd_bomba -= qtd;
	}
	
	public void porLitro(double litro) {
		this.quantidadeCombustivel += litro;
		this.qtd_bomba -= litro;
	}

	public double getQtdCombustivel() {
		return this.quantidadeCombustivel;
	}
	public double getQtdBomba() {
		return this.qtd_bomba;
	}
	public String getTipo(){
		return this.tipoCombustivel;
	}
}
