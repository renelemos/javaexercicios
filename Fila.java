package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e add adicionam elementos na fila
		//Diferen�a � o comportamento quando a fila est� cheia!
		
		fila.add("Ana");   //Retorna falso
		fila.offer("Bia"); //Lan�a uma exce��o
		fila.add("Carlos"); 
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e Element -> obter pr�ximo elemento da fila sem remover
		//Diferen�a � o comportamento quando a fila est� vazia
		
		System.out.println(fila.peek()); //Retorna false se fila estiver vazia
		System.out.println(fila.peek());
		System.out.println(fila.element()); //Lan�a uma exce��o
		System.out.println(fila.element());
		
	
		
		//Poll e remove -> Obt�m o pr�ximo elemento da fila e remove
		//Diferen�a � o comportamento quando a fila est� vazia
		
		System.out.println(fila.poll()); //Lan�a uma excel��o
		System.out.println(fila.remove()); //Retorna false
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());

		//System.out.println(fila.size());
		//System.out.println(fila.clear());
		//System.out.println(fila.isEmpty());	
		//System.out.println(fila.contains());		
		
		
		}
	}

