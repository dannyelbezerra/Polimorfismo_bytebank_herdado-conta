package br.com.bytebank.banco.modelo;

/**
* Classe que representa a moldura de uma conta.
*
*@author Dannyel Bezerra
*@version 0.1
*/

public abstract class Conta extends Object implements Comparable<Conta>{ //não pode instanciar uma class abstract;
	protected double saldo; //o protected é public, visível apenas para as classes filhas; 
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;// O static faz com que o atributo seja da classe, e não mais do objeto. Com isso, todo o objeto conta possui acesso a um único total.
	
//	public Conta() {
//		
//	}

	/** * Construtor para inicializar o objeto a partir da agencia e numero* 
	 *@param agencia 
	 *@param numero 
	 * 
	*/	

/* Uma class abstrata pode ter atributos, construtor, métodos concretos;
 * //Método sem corpo, não há implementação; 
 * As classes filhas concretas, tem que fazer a implementação do método;
 */

	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia; //o this faz referência ao objeto;
		this.numero = numero;
		//System.out.println("Estou criando uma conta " + this.numero);
	}
	
	public abstract void deposita(double valor);
	
	/** 
	 * 
	 * 
	 *@param valor 
	 *@throws SaldoInsuficienteException 
	*/
	
	public void saca(double valor) throws SaldoInsuficienteException {
		
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}

		this.saldo -= valor;		
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca (valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("nao pode valor menor igual a 0");
			return; //o return para a execução do método e volta para quem tava chamando;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("nao pode valor menor igual a zero");
			return;
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override 
	public boolean equals(Object ref) {
		
		Conta outra = (Conta) ref; //Faz o cast, transformando a referência genérica em específica;
		
		if(this.agencia != outra.agencia) {
			return false;
		}
		
		if(this.numero != outra.numero) {
			return false;
		}
		
		return true;
		
	}
	
	@Override
		public int compareTo(Conta outra) {
			
			return Double.compare(this.saldo, outra.saldo);
		}
	
	@Override 
	public String toString() { 
	    return "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo;
	}
	
}