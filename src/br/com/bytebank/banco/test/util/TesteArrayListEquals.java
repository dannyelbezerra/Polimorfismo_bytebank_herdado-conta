package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		//Estamos utilizando a interface List (java.util.List) para definirmos o tipo da refer�ncia. 
		List<Conta>lista = new ArrayList<Conta>();//Os GENERICS, sinais de <>, servem para indicar o tipo de classes e objetos que aquela lista poder� armazenar, no nosso caso, ser� Conta;
		
	    Conta cc = new ContaCorrente(22, 11);
	    lista.add(cc);
	
	    Conta cc2 = new ContaCorrente(22, 22);
	    lista.add(cc2);
	    
	    Conta cc3 = new ContaCorrente(22, 22);
	    
	 // boolean existe = lista.contains(cc3); //o CONTAINS, devolve um boolean (True or False);
	    
	    boolean existe = lista.contains(cc3);
	    
	    System.out.println("J� existe? " + existe);
	    
	    for(Conta conta : lista) {
	    	System.out.println(conta);
	    }
	    
	    
//	    for(Conta conta : lista) {
//	    	if(conta == cc3);
//	    	System.out.println("J� tenho essa conta");
//	    }
	    

	    
	}

}
