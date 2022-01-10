package classe.classeDesafio;

public class Jantar {
	public static void main(String[] args) {
		
		Comida c1 = new Comida("feijao", 0.5);
		
		Comida c2 = new Comida("arroz", 0.233);
	
		Comida c3 = new Comida("macarrao", 0.77);
				
		Pessoa p = new Pessoa("João", 89);
		
		System.out.println(p.apresentar());
		
		p.comer(c1);	
		
		System.out.println(p.apresentar());
		
		p.comer(c2);	
		
		System.out.println(p.apresentar());

		p.comer(c3);	
		
		System.out.println(p.apresentar());
		
		}
}