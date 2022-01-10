package classe;

import java.util.Date;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "Pedro.silva@ezemail.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "Pedro.silva@ezemail.com.br";
		
		System.out.println(u1==u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		System.out.println(u2.equals(new Date()));
	}
	// O hashcode ser� abordado em outra aula.
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
