package Comparação;
import java.util.Scanner;

public class Excercicio {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int c,
            thisIsAVariable,
            q76354,
            number;

        
        System.out.print("Insira um valor inteiro: ");
        number = input.nextInt();

        if(number != 7)
            System.out.println("A variável number não é igual a 7");

        System.out.println("This is a Java Program");

        System.out.printf("%s%n %s%n","This is a" ,"Java Program" );
        
    
        input.close();
    }
    
}
