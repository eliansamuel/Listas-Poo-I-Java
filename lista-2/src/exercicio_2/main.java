package exercicio_2;

public class main {

	public static void main(String[] args) {
		
		System.out.println("==========================================================");
		
		ingresso popo = new ingresso(50);
		normal  norm = new normal(50, null);
		vip vip = new vip(50, 50);
		camaroteInferior inf = new camaroteInferior(50, 50, "Camarote Inferior");
		camaroteSuperior sup = new camaroteSuperior(50, 50, 50, "Camarote Superior");
		
		System.out.println("O preço do ingresso normal é R$ " + norm.getNormal());
		System.out.println("==========================================================");
		System.out.println("O preço do ingresso VIP é R$ " + vip.valorVip());
		System.out.println("==========================================================");
		System.out.println("O preço do ingresso do " + inf.getLocal() + " é  de R$ " + inf.getValorCamaroteInferior());
		System.out.println("==========================================================");
		System.out.println("O preço do ingresso do " + sup.getLocal() + " é  de R$ " + sup.getValorCamaroteSuperior());
		System.out.println("==========================================================");;
		
	}

}
