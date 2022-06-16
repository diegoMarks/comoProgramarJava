package exercicios;

import java.util.Scanner;

public class Exercicio215 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a, b, soma, produto, diferenca, divisao;
		
		System.out.print("Insira o valor de A: ");
		a = input.nextInt();
		
		System.out.print("Insira o valor de B: ");
		b = input.nextInt();
		
		soma = a + b;
		System.out.printf("%d + %d = %d%n", a,b,soma);
		
		produto = a * b;
		System.out.printf("%d * %d = %d%n", a,b,produto);
		
		diferenca = a - b;
		System.out.printf("%d - %d = %d%n", a,b,diferenca);
		
		divisao = a / b;
		System.out.printf("%d / %d = %d%n", a,b,divisao);
		
		input.close();
	}

}
