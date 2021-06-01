
public class Testes {

	public static void main(String[] args) {
		
		Bola booble = new Bola("preta", 7, "cobre");
		System.out.println("A cor da bola �: " + booble.getCor());
		booble.setCor("azul");
		System.out.println("Agora a cor da bola �: " + booble.getCor());
		
		System.out.println("==================================================================================");

		Quadrado quad = new Quadrado(5);
		System.out.println("O lado do quadrado � " + quad.getLado());
		System.out.println("A �rea do quadrado � " + quad.getArea());
		quad.mudarLado(7);
		System.out.println("Agora o lado do quadrado � " + quad.getLado());
		System.out.println("Agora a �rea do quadrado � " + quad.getArea());
		
		System.out.println("==================================================================================");

		Pessoa levi = new Pessoa("Jubileu", 18, 89.5, 1.85);
		System.out.println(levi.getNome() + " tem " + levi.getIdade() + " anos, mede " + levi.getAltura() + " metros e pesa " + levi.getPeso());
		levi.envelhecerPessoa(22);
		System.out.println(levi.getIdade());
		System.out.println(levi.getAltura());
		
		System.out.println("==================================================================================");

		TV tubo = new TV(10, 20);
		System.out.println("A televis�o est� no canal " + tubo.getCanal() + " e a televis�o est� com o volume " + tubo.getVolume());
		tubo.setCanal(200);
		tubo.aumentarVolume();
		tubo.aumentarVolume();
		tubo.aumentarVolume();
		tubo.diminuirVolume();
		System.out.println("A televis�o est� no canal " + tubo.getCanal() + " e a televis�o est� com o volume " + tubo.getVolume());
		tubo.setCanal(201);
		
		System.out.println("==================================================================================");
		
		Bichinho_Virtual jubileu = new Bichinho_Virtual("Jubileu", 0, 1, 5);
		System.out.println(jubileu.getNome() + " est� se sentindo " + jubileu.getHumor());
		jubileu.fome(1);
		System.out.println(" Agora " + jubileu.getNome() + " est� se sentindo " + jubileu.getHumor());
		jubileu.saude(0);
		System.out.println(" Agora " + jubileu.getNome() + " est� se sentindo " + jubileu.getHumor());
		
		System.out.println("==================================================================================");
		
		Bomba_de_combustivel bomba = new Bomba_de_combustivel("Gasolina", 7.0,15, 1000);
		
		System.out.println("Abastecendo R$70,00 de " + bomba.getTipo());
		bomba.porValor(70);
		System.out.println("Agora o tanque est� com " + bomba.getQtdCombustivel());
		System.out.println("E sobrou " + bomba.getQtdBomba() + " litros na bomba!");
		
		
		
	}
	

}
