package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		
		/*
		 * Um array tamb�m � um objeto, assim sendo, precisamos cri�-lo, 
		 * pois temos uma refer�ncia que ainda n�o foi inicializada;
		 * Ao criar o Array, precisamos informar o seu tamanho;
		 */
		
		int[] idades = new int[5]; //inicializa o Array com os valores padr�es; IDADES � uma refer�ncia que aponta para um objeto;
		
		// inicializa o Array com a refer�ncia IDADES, seguido dos [] e informa o valor que deve ser armazenado;
		
		idades[0] = 29; //serve para guardar uma informa��o em uma posi��o do Array;
		idades[1] = 39;
		idades[2] = 49;
		idades[3] = 59;
		idades[4] = 69;
		
		int idade1 = idades[0]; //acessa o array na posi��o 0 = idade1;
		
		System.out.println(idade1);
		System.out.println(idades.length); //o Length serve para saber o tamanho do Array;
		
	}

}
