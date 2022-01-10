package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5;
				System.out.println(a);
				
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);

		c = "Outro Texto";
		System.out.println(c);
		
		double d; //variavel declarada
		d = 123.65; //variavel foi inicializada
		System.out.println(d); //variavel foi usada
		
		var e = 123.45;
		System.out.println(e);
		
		var f = 12; //inteiro
		System.out.println(f);
		//f = 12.01 não dá, porém o inverso funciona
		
	}
}
