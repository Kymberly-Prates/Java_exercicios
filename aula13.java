package aula13;

public class aula13 {


	public static void main(String[] args) {

		String nome = "Kymberly Prates";
		System.out.println(nome);

		int qtdCaracteres = nome.length();

		System.out.println(qtdCaracteres);

		String nomeMaiusculo = nome.toUpperCase();

		System.out.println(nomeMaiusculo);

		String nomeMinusculo = nome.toLowerCase();

		System.out.println(nomeMinusculo);
		
		String texto= "Quem tenta adiantar muito só se atrasa !";
		
		int localizarPalavra =texto.indexOf("sol");
		
		System.out.println(localizarPalavra);
		
		String primeiroNome = "Kymberly ";
		
		String segundoNome = "Prates";
		
		System.out.println(primeiroNome+" "+segundoNome);
		
		System.out.println(primeiroNome.concat(segundoNome));
		
	}

}
