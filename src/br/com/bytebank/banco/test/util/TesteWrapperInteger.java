package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
	
		/* Para criarmos um objeto, temos que utilizar a classe, com o método estático valueOf(), que receberá um primitivo int;
		 * Ao utilizarmos o new em um objeto, delegamos a criação para um método.
		 * O jeito mais adequado de fazermos isso em nosso código é utilizando o método valueOf(), 
		 * e termos como resultado uma referência. 
		 * A partir desta referência idadeRef, podemos chamar métodos. Por exemplo, o intValue().
		 * Temos uma referência, que aponta para um objeto, e queremos obter desta classe wrapper - que embrulha o primitivo -, 
		 * qual o valor que nela está contido. 
		 * É para isso que o método intValue() é utilizado, ele nos devolve, justamente, o primitivo:
		 * 
		 */
		
		int idade = 29;
		Integer idadeRef = Integer.valueOf(29); //Autoboxing; A partir da referencia idadeRef, pode chamar métodos;
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
		numeros.add(29);//A transformação do Primitivo para Objeto, é chama da de Autoboxing, e de Objeto para o tipo Primitivo, Unboxing;

		
		
		
		
		
	}
}