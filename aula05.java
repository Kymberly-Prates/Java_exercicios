package aula05;
import java.util.Scanner;

public class aula05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero :");
		float valor = sc.nextFloat();
		System.out.println("Digite um n�mero :");
		float valor2 = sc.nextFloat();
		float soma = valor+valor2;
		System.out.printf("O valor total da soma � : %.2f \n" , soma);
		
		if (soma>10) {
			System.out.println("N�mero � maior que 10");
		}else {
			System.out.println("N�mero � menor que 10");
		}
		
		sc.close();
		
	}

}
