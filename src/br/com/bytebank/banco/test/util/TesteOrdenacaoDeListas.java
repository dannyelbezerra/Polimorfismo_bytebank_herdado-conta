package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacaoDeListas {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
//		NumeroDaContaComparator comparator = new NumeroDaContaComparator();
//		TitularDaContaComparator titularComparator = new TitularDaContaComparator();

		/*Percebemos que a referência de cada um dos comparadores é utilizada somente para o método sort(), 
		 * sendo assim, é comum que o construtor new seja inserido diretamente como parâmetro deste método.
		 * Isso acaba com a necessidade da criação da referência, e a linha pode ser apagada.
		 * 
		 * 
		 * 
		 */
		
		lista.sort(new TitularDaContaComparator());
//		Collections.sort(lista, new TitularDaContaComparator());
		Collections.sort(lista);
		Collections.reverse(lista);
		
		System.out.println("--------------");
		
		for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getTitular().getNome());
		}
		
	}
}

class TitularDaContaComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		 
		String nomeC1 = c1.getTitular().getNome();
        String nomeC2 = c2.getTitular().getNome();
               
		return nomeC1.compareTo(nomeC2);
		
		/*Agora nos resta criar o método de comparação pela ordem alfabética. 
		 * A classe String já possui, implementado, um método de ordenação utilizando este critério.
		 * Ao chamarmos o nomeC1, surgirá uma lista de métodos, dentre eles, temos o compareTo(), 
		 * que recebe como parâmetro um outro String, e que resulta em um int. Quando os "Strings" forem iguais, o retorno é 0, 
		 * se um for menor que o outro, o resultado é negativo, e se um for maior que o outro, o resultado é positivo.
		 * Já que o resultado é um Integer, podemos inseri-lo diretamente como retorno;
		 */
		
	}
	
}

//serve para comparar duas referências, por meio de um método presente na interface Comparator.
class NumeroDaContaComparator implements Comparator<Conta>{
	

	@Override
	public int compare(Conta c1, Conta c2) {
		
		return Integer.compare(c1.getNumero(), c2.getNumero());
		
//		return c1.getNumero() - c2.getNumero(); Métodos de comparar inteiros;
		
//		if(c1.getNumero() < c2.getNumero()) {
//			return -1;
//		}
//		
//		if(c1.getNumero() > c2.getNumero()) {
//			return 1;
//		}
//		return 0;
	}
	
}