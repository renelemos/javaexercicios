package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e add adicionam elementos na fila
		//Diferença é o comportamento quando a fila está cheia!
		
		fila.add("Ana");   //Retorna falso
		fila.offer("Bia"); //Lança uma exceção
		fila.add("Carlos"); 
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e Element -> obter próximo elemento da fila sem remover
		//Diferença é o comportamento quando a fila está vazia
		
		System.out.println(fila.peek()); //Retorna false se fila estiver vazia
		System.out.println(fila.peek());
		System.out.println(fila.element()); //Lança uma exceção
		System.out.println(fila.element());
		
	
		
		//Poll e remove -> Obtém o próximo elemento da fila e remove
		//Diferença é o comportamento quando a fila está vazia
		
		System.out.println(fila.poll()); //Lança uma excelção
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

