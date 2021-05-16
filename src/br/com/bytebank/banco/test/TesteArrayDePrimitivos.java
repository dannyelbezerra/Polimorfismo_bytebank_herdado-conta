package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		
		/*
		 * Um array também é um objeto, assim sendo, precisamos criá-lo, 
		 * pois temos uma referência que ainda não foi inicializada;
		 * Ao criar o Array, precisamos informar o seu tamanho;
		 */
		
		int[] idades = new int[5]; //inicializa o Array com os valores padrões; IDADES é uma referência que aponta para um objeto;
		
		// inicializa o Array com a referência IDADES, seguido dos [] e informa o valor que deve ser armazenado;
		
		idades[0] = 29; //serve para guardar uma informação em uma posição do Array;
		idades[1] = 39;
		idades[2] = 49;
		idades[3] = 59;
		idades[4] = 69;
		
		int idade1 = idades[0]; //acessa o array na posição 0 = idade1;
		
		System.out.println(idade1);
		System.out.println(idades.length); //o Length serve para saber o tamanho do Array;
		
	}

}
