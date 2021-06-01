
public class main {

	public static void main(String[] args) {
		
		Bola booble = new Bola("preta", 7, "cobre");
		System.out.println("A cor da bola é: " + booble.getCor());
		booble.setCor("azul");
		System.out.println("Agora a cor da bola é: " + booble.getCor());
		
		System.out.println("==================================================================================");

		Quadrado quad = new Quadrado(5);
		System.out.println("O lado do quadrado é " + quad.getLado());
		System.out.println("A área do quadrado é " + quad.getArea());
		quad.mudarLado(7);
		System.out.println("Agora o lado do quadrado é " + quad.getLado());
		System.out.println("Agora a área do quadrado é " + quad.getArea());
		
		System.out.println("==================================================================================");

		Pessoa levi = new Pessoa("Jubileu", 18, 89.5, 1.85);
		System.out.println(levi.getNome() + " tem " + levi.getIdade() + " anos, mede " + levi.getAltura() + " metros e pesa " + levi.getPeso());
		levi.envelhecerPessoa(22);
		System.out.println(levi.getIdade());
		System.out.println(levi.getAltura());
		
		System.out.println("==================================================================================");

		TV tubo = new TV(10, 20);
		System.out.println("A televisão está no canal " + tubo.getCanal() + " e a televisão está com o volume " + tubo.getVolume());
		tubo.setCanal(200);
		tubo.aumentarVolume();
		tubo.aumentarVolume();
		tubo.aumentarVolume();
		tubo.diminuirVolume();
		System.out.println("A televisão está no canal " + tubo.getCanal() + " e a televisão está com o volume " + tubo.getVolume());
		tubo.setCanal(201);
		
		System.out.println("==================================================================================");
		
		Bichinho_Virtual jubileu = new Bichinho_Virtual("Jubileu", 0, 1, 5);
		System.out.println(jubileu.getNome() + " está se sentindo " + jubileu.getHumor());
		jubileu.fome(1);
		System.out.println(" Agora " + jubileu.getNome() + " está se sentindo " + jubileu.getHumor());
		jubileu.saude(0);
		System.out.println(" Agora " + jubileu.getNome() + " está se sentindo " + jubileu.getHumor());
		
		System.out.println("==================================================================================");
		
		Bomba_de_combustivel bomba = new Bomba_de_combustivel("Gasolina", 7.0,15, 1000);
		
		System.out.println("Abastecendo R$70,00 de " + bomba.getTipo());
		bomba.porValor(70);
		System.out.println("Agora o tanque está com " + bomba.getQtdCombustivel());
		System.out.println("E sobrou " + bomba.getQtdBomba() + " litros na bomba!");
		
		
		
	}
	

}
