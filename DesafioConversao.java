package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o salário1: ");
		String salario1 = entrada.next().replace(",", ".");
		
		System.out.print("Digite o salário2: ");
		String salario2 = entrada.next().replace(",", ".");		
		
		System.out.print("Digite o salário3: ");
		String salario3 = entrada.next().replace(",", ".");		
		
		double sal1 = Double.parseDouble(salario1);
		double sal2 = Double.parseDouble(salario2);
		double sal3 = Double.parseDouble(salario3);
		
		double soma = sal1 + sal2 + sal3;
		
		System.out.println("A média dos três salários é:" + soma/3);
		
		entrada.close();
		
	}
}
