package exercicio_3;

public class main {

	public static void main(String[] args) {
		
		assistenteTecnico marcos = new assistenteTecnico("Marcos", "Rua Jubileu dos Alpes, num1002", 987654321, "relampago.marquinhos21@vrumvrum.com", 123, 500);
		assistenteAdm julia = new assistenteAdm("Julia", "Rua Arroz com Feijão, num 1021", 123456789, "jujutrovoada@juju.com", 321, "NOITE", 0);
		System.out.println("======================================================================================");
		System.out.println("O assistente Técnico " + marcos.getNome() + " é funcionário que possui número de matrícula " + marcos.getMatricula());
		System.out.println("======================================================================================");
		System.out.println("A assistente Administritiva " + julia.getNome() + " é a funcionária que possui o número de matrícula " + julia.getMatricula());
		System.out.println("======================================================================================");

	}

}
