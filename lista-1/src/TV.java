
public class TV {
	
	private int canal, volume;
	
	public TV(int canal, int volume) {
		this.canal = canal;
		this.volume = volume;
	}
	
	public void setCanal(int canal) {
		if (canal >= 1 && canal <= 200)
			this.canal = canal;
		else
			System.out.println("Esse canal n�o existe!");
	}
	
	public void aumentarVolume() {
		if (volume < 100)
			this.volume++;
		else
			System.out.println("O volume j� est� no m�ximo!");
	}
	
	public void diminuirVolume() {
		if (volume >= 1)
			this.volume--;
		else
			System.out.println("O volume j� est� no m�nimo!");
	}
	
	public int getCanal() {
		return this.canal;
	}
	
	public int getVolume() {
		return this.volume;
	}
}
