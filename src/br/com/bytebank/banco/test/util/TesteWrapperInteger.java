package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
	
		/* Para criarmos um objeto, temos que utilizar a classe, com o m�todo est�tico valueOf(), que receber� um primitivo int;
		 * Ao utilizarmos o new em um objeto, delegamos a cria��o para um m�todo.
		 * O jeito mais adequado de fazermos isso em nosso c�digo � utilizando o m�todo valueOf(), 
		 * e termos como resultado uma refer�ncia. 
		 * A partir desta refer�ncia idadeRef, podemos chamar m�todos. Por exemplo, o intValue().
		 * Temos uma refer�ncia, que aponta para um objeto, e queremos obter desta classe wrapper - que embrulha o primitivo -, 
		 * qual o valor que nela est� contido. 
		 * � para isso que o m�todo intValue() � utilizado, ele nos devolve, justamente, o primitivo:
		 * 
		 */
		
		int idade = 29;
		Integer idadeRef = Integer.valueOf(29); //Autoboxing; A partir da referencia idadeRef, pode chamar m�todos;
		int valor = idadeRef.intValue(); //Unboxing;
		
		System.out.println(idadeRef.doubleValue()); //transforma int em double;
		
		System.out.println(Integer.MAX_VALUE); //Valor max do Integer;
		System.out.println(Integer.MIN_VALUE); //Valor min do Integer;
		System.out.println(Integer.SIZE); //Tamano do Integer;
		System.out.println(Integer.BYTES);
		
		String s = args[0];
//		Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s); //O parseInt transforma o String em primitivo;
		System.out.println(numero);
		
		
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29);//A transforma��o do Primitivo para Objeto, � chama da de Autoboxing, e de Objeto para o tipo Primitivo, Unboxing;

		
		
		
		
		
	}
}