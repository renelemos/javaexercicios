package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Informacoes do funcionario
		
		//Tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		//este L serve para indicar que é maior que a capacidade do long
		
		//tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo booleano
		boolean estaDeFerias = false; // true
		
		char status = 'A'; //ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa*365);
		
		//Numero de viagens
		System.out.println(numeroDeVoos/2);
		
		//Pontos por real
		System.out.println(pontosAcumulados /  vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
		
		
		
	}
}
