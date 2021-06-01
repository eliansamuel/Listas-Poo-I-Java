package exercicio_5;

public class main {

	public static void main(String[] args) {
		
		rica rica = new rica("Jubileuson", 30, 1000000);
		pobre pobre = new pobre("Gomes da Silva", 25);
		miseravel tamal = new miseravel("Vanderscleison", 40);
		
		System.out.println("======================================================");
		System.out.println("Jubileuson: " 
		+ rica.getRica());
		System.out.println("======================================================");
		System.out.println("Gomes da Silva: " 
		+ pobre.getWork());
		System.out.println("======================================================");
		System.out.println("Vanderscleison: " 
		+ tamal.getMendiga());
		System.out.println("======================================================");
	}

}