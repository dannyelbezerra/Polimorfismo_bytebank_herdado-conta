package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {

   /*
	* Object literal. N�o precisa do new para instanciar, criar o objeto String.
	* uma vez criada uma String, ela � imut�vel, n�o pode ser alterada posteriormente;
    */ 
		String nome = "Alura"; 
		System.out.println(nome.length());// Qual o tamanho da String;
		
		for(int i = 0; i < nome.length(); i++) { //vai iterar at� o tamanho da String;
			System.out.println(nome.charAt(i)); //Vai imprimir caractere por caractere;
		}
		
		String vazio = "";
		System.out.println(vazio.isEmpty()); //retorna um boolean true or false, dizendo se a String t� ou n�o vazia;

		String vazia = "   Alura ";
		String outroVazia = vazia.trim(); //O trim retira os espa�os vazios da String;
		
		System.out.println(vazia);
		System.out.println(outroVazia);
		
		String vazios = "Alura";
		System.out.println(vazios.contains("Alu")); //O contains verifica se uma String possui uma sub-String;
		
//		char c = 'A';
//		char d = 'a';
		
//		char c = nome.charAt(1); //mostra qual a posi��o de determinado caractere;
//		System.out.println(c);
		
//		int posicao = nome.indexOf("ur"); //qual a posicao da substring, dentro da String Alura;
//		System.out.println(posicao);
		
//		String substring = nome.substring(1); //cria uma substring e nos diz a partir de que posi��o iniciamos a contagem;
//		System.out.println(substring);
		
		
	
// Cria uma nova String e devolve uma refer�ncia que aponta para esse novo objeto, que representa a altera��o;	
		
//		String outro = nome.toLowerCase();
//		String outros = nome.toUpperCase();
//		String outra = nome.replace("Al", "aL"); //char sentence;
//		String outraa = nome.replace('A', 'a'); //altera apenas 1 caractere;
//		String outroo = nome.replace(c, d);
		
	
		
//		System.out.println(nome);
//		System.out.println(outra);
//		System.out.println(outro);
//		System.out.println(outros);
//		System.out.println(outraa);
//		System.out.println(outroo);
		
/*O StringBuilder � uma classe comum. Repare que usamos o new para a cria��o do objeto. 
 * Al�m disso, como o objeto � mut�vel, utilizamos a mesma refer�ncia, sem novas atribui��es.
 */
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("�nibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto = builder.toString();
		System.out.println(texto);
	
	}

}
