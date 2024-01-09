package Torre.Hanoi;

import java.util.Stack;

// Trabalho de Isaac Oliveira, João pedro, Joyce Rodrigues e Raquel sales 

public class Torre {

	public static void main(String[] args) {
		// criando as pilhas (as torres de hanoi
		Stack <Integer> Origem = new Stack<>();
		Stack <Integer> Destino = new Stack<>();
		Stack <Integer> Auxiliar = new Stack<>();

		Origem.push(4);
		Origem.push(3);
		Origem.push(2);
		Origem.push(1);
		TorreHanoi(Origem.size(), Origem, Auxiliar, Destino);
	}
	public static void TorreHanoi(int numero,Stack <Integer> Origem , Stack <Integer> Destino,Stack <Integer> Auxiliar) {
		if (numero>0) {
			TorreHanoi(numero -1, Origem, Auxiliar, Destino);
			Destino.push(Origem.pop());
			System.out.println("------");
			System.out.println("Origem: "+Origem);
			System.out.println("Destino: "+Destino);
			System.out.println("Axuliar: "+Auxiliar);
			TorreHanoi(numero -1, Auxiliar, Destino, Origem);
		}
	}
}
