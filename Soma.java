import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int soma;

        System.out.print("Insira o primeiro número: ");
        number1 = input.nextInt();
        System.out.print("Insira o segundo número: ");
        number2 = input.nextInt();

        soma = number1 + number2;

        System.out.printf("A soma é %d%n",number1 + number2);

        input.close();
    }
    
}
