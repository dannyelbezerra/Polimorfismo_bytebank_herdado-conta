package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		ArrayList<Conta>lista = new ArrayList<Conta>();//Os GENERICS, sinais de <>, servem para indicar o tipo de classes e objetos que aquela lista poderá armazenar, no nosso caso, será Conta;
		
	    Conta cc = new ContaCorrente(22, 11);
	    lista.add(cc);
	
	    Conta cc2 = new ContaCorrente(22, 22);
	    lista.add(cc2);
	    
	    System.out.println("Tamanho: " + lista.size()); // lista.size, verifica o tamanho da lista;
	    
	  //Conta ref = (Conta) lista.get(0); //Transforma uma referência mais genérica, numa mais específica; Pega um elemento da lista e imprime;
	    
	    Conta ref = lista.get(0); //Não é preciso fazer mais o Cast, pois o compilador sabe, que o método get(), retornará uma referência do tipo Conta;
	    System.out.println(ref.getNumero());
	    
	    lista.remove(0);
	    
	    System.out.println("Tamanho: " + lista.size());
	    
	    Conta cc3 = new ContaCorrente(33, 311);
	    lista.add(cc3);
	
	    Conta cc4 = new ContaCorrente(23, 322);
	    lista.add(cc4);
	    
	    for(int i = 0; i < lista.size(); i++) {
	    //	Object oRef = lista.get(i);
	    //	System.out.println(oRef);
	    //	Duas maneiras de imprimir a lista;
	    	
	    	System.out.println(lista.get(i));
	    }
	    
	    System.out.println("--------------------------");
	    
	    //Forma mais enxuta de fazer o laço;
	    
//	    for(Object oRef : lista) {
//	    	System.out.println(oRef);
//	    }
	    
	    for(Conta conta : lista) {
	    	System.out.println(conta);
	    }
	    
	}

}
