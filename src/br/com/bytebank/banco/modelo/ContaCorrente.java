package br.com.bytebank.banco.modelo;


/*Estendendo a Conta os atributos e métodos são herdados, 
 * entretanto, os construtores não são herdados. 
 * Os construtores pertencem somente à sua própria classe.
 */

public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero); //podemos utilizar o super para chamar um construtor específico da class mãe, passando os parâmetros específicos para ele;
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

	@Override 
	public String toString() { 
	    return "ContaCorrente, " + super.toString();
	}
}
