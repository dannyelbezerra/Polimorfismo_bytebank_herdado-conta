package br.com.bytebank.banco.modelo;

//public class SaldoInsuficienteException extends RuntimeException{ UNCHECKED
public class SaldoInsuficienteException extends Exception{ //CHECKED
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}

}
