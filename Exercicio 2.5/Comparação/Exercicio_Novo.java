package Comparação;

import java.util.Scanner;

public class Exercicio_Novo {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int x,y,z,result;
        
        System.out.print("Insira o primeiro valor: ");
        x = input.nextInt();

        System.out.print("Insira o segundo valor: ");
        y = input.nextInt();

        System.out.print("Insira o terceiro valor: ");
        z = input.nextInt();

        result = x * y * z;

        System.out.printf("%s %d%n","Produtct is", result);


        input.close();
    }
}