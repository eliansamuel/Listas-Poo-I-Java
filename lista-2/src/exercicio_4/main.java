package exercicio_4;

public class main {

	public static void main(String[] args) {
		
		cachorro pipoca = new cachorro("Pipoca", "cachorro");
		gato toninho = new gato("Toninho", "gato");
		System.out.println("===========================");
		System.out.println("O nome do cachorro é " + pipoca.getNome());
		System.out.println(pipoca.getNome()  + pipoca.getAndar());
		System.out.println("===========================");
		System.out.println("O nome do gato é " + toninho.getNome());
		System.out.println(toninho.getNome()  + toninho.getAndar());
		System.out.println("===========================");
		
		
	}

}
