import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
       //Programa que executa um cálculo de folha de pagamento. 
        
        Scanner input = new Scanner(System.in);

        int a,b,c;

        System.out.print("Valor de A: ");
        a = input.nextInt();
        System.out.print("Valor de B: ");
        b = input.nextInt();

        c = a * b;

        System.out.printf("%s %d%n","Valor de c ",c);

        input.close();
    }
}