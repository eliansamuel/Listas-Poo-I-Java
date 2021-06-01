package exercicio_1;

public class main {

	public static void main(String[] args) {
		
		System.out.println("====================================================================================");
		
		empregado jubileu = new empregado(002,"Jubileu", "jubileu.contato@juju.com", 2000);
		
		System.out.println("O empregado " + jubileu.getNome() + " recebe R$ " + jubileu.getSalario() + " por mês");
		jubileu.aumentoSalarial(25);
		System.out.println("Agora o empregado " + jubileu.getNome() + " passou a receber R$ " + jubileu.getSalario() + " por causa de seu aumento!");
		
		System.out.println("====================================================================================");
		
		chefe joice = new chefe(001, "Joice", "joice123@jojo.com", 5000, 500);
		
		System.out.println("A chefe " + joice.getNome()+ " recebe R$ " + joice.getSalario() + " por mês");
		joice.aumentoSalario(20);
		System.out.println("Agora a chefe " + joice.getNome() + " passou a receber R$ " + joice.getSalario() + " por causa de seu aumento!");
		
		System.out.println("====================================================================================");
		
		estagiario eduardo = new estagiario(003, "Eduardo", "eduardo123@dudu.com", 1200, 100);
		
		System.out.println("O estagiário " + eduardo.getNome()+ " recebe R$ " + eduardo.getSalario() + " por mês");
		eduardo.aumentoSalario(35);
		System.out.println("Agora o estagiário " + eduardo.getNome() + " passou a receber R$ " + eduardo.getSalario() + " por causa de seu aumento!");
		
		System.out.println("====================================================================================");
		
	}

}
