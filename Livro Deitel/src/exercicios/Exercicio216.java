package exercicios;

import java.util.Scanner;

public class Exercicio216 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("Valor de A: ");
		a = input.nextInt();
		
		System.out.print("Valor de B: ");
		b = input.nextInt();
		
		
		if(a > b)
			System.out.println("A � maior que B");
		if (a < b)
			System.out.println("A � menor que B");
		if (a == b)
			System.out.println("S�o iguais");
			
		input.close();	
	}

}
