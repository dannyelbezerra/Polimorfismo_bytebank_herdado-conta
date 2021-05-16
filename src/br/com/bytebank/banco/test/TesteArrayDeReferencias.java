package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayDeReferencias {

	public static void main(String[] args) {

		ContaCorrente[] contas = new ContaCorrente[5]; //cria um objeto que pode guardar 5 referências; O valor padrão de Referencias = NULL;
		
		ContaCorrente cc1 = new ContaCorrente(22, 11); //cria o objeto ContaCorrente de referência cc1, que aponta para o objeto;
		contas[0] = cc1; //atribui o valor CC1, que vai ser armazenado na posição 0 do array;

		ContaCorrente cc2 = new ContaCorrente(22, 22);
		contas[1] = cc2;
		
		ContaCorrente cc3 = new ContaCorrente(22, 33);
		contas[2] = cc3;
		
		ContaCorrente cc4 = new ContaCorrente(22, 44);
		contas[3] = cc4;
		
		ContaCorrente cc5 = new ContaCorrente(22, 55);
		contas[4] = cc5;
		
		System.out.println(contas[1].getNumero()); //para acessar o objeto, usa-se o operador de navegação ".";
		
		
		
		
	}

}
