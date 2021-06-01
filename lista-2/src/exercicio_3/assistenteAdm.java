package exercicio_3;

public class assistenteAdm extends assistente{
	private String dia_noite;
	private float adc_noturno;

	
	public assistenteAdm(String nome, String endereco, int telefone, String email, int matricula, String dia_noite, float adc_noturno) {
		super(nome, endereco, telefone, email, matricula);
		this.dia_noite = dia_noite;
		this.adc_noturno = adc_noturno;
	}
	
	public void getNoturno(String dia_noite) {
		if (dia_noite.toUpperCase() == "NOITE") {
				this.adc_noturno = 200;
		}
		if (dia_noite.toUpperCase() == "DIA") {
				this.adc_noturno = 0;
		}

	}

}
