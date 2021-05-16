package br.com.bytebank.banco.modelo;


/*Estendendo a Conta os atributos e m�todos s�o herdados, 
 * entretanto, os construtores n�o s�o herdados. 
 * Os construtores pertencem somente � sua pr�pria classe.
 */

public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero); //podemos utilizar o super para chamar um construtor espec�fico da class m�e, passando os par�metros espec�ficos para ele;
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
