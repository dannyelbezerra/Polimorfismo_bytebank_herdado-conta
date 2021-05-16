package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayDeReferencias2 {

	public static void main(String[] args) {

		//Conta[] contas = new Conta[5]; //cria um objeto que pode guardar 5 referências; O valor padrão de Referencias = NULL;
		Object[] referencias = new Object[5]; //Pode guardar qualquer tipo de referência dentro do array;
		
		ContaCorrente cc1 = new ContaCorrente(22, 11); 
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
	
		//Conta ref = (Conta)contas[1];
		
		ContaPoupanca ref = (ContaPoupanca)referencias[1]; //type cast; Transforma a referência , numa mais específica, do tipo ContaPoupanca;
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		//System.out.println(((Conta) referencias[1]).getNumero());
		
		
	}

}
