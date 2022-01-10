package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		double tf = 150;
		final double FM = 5.0/9.0; //fator multiplicador
		final double FS = 32; //fator soma
		double tc = (tf - FS) * (FM);
		
		System.out.println("Fahrenheit = " + tf + " F");
		System.out.println("Temperatura em Celsius é " + tc + " °C");
	}
}
	