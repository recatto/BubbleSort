package sort;

/*
 * 
 * Author: Renan Catto
 * 
 */

public class BubbleSort {

	public static void main(String[] args) {
		int teste[] = {8, 3, 27, 432, 1, 33, 81, 99, 101, 5};
		int x;
		
		System.out.println("Vetor antes do BubbleSort: ");
		for(x = 0; x < teste.length; x++) {
			System.out.print(teste[x] + " ");
		}
		System.out.println("");
		
		Bubble(teste);
		
		System.out.println("Vetor pós BubbleSort: ");
		for(x = 0; x < teste.length; x++) {
			System.out.print(teste[x] + " ");
		}
		System.out.print("");

	}

	public static int[] Bubble(int[] vetor) {
		if (vetor == null || vetor.length == 1) {
			return vetor;
		}
		
		boolean trocado = false;
		
		while(!trocado) {
			trocado = true;
			for (int i = 0; i < vetor.length - 1; i++) {
				if (vetor [i] > vetor[i + 1]) {
					int aux = vetor[i + 1];
					vetor[i + 1] = vetor[i];
					vetor[i] = aux;
					trocado = false;

				}
			}

		}
		return vetor;
	}
	
}
