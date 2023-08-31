package academy.devdojo.maratonajava.javacore.CompassUol.teste;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args){
        Scanner infoSacanner = new Scanner(System.in);
        System.out.println("Enter Number1: ");
        double number1 = infoSacanner.nextInt();
        System.out.println("The number you enter is: "+number1);
        System.out.println("Enter Number2: ");
        double number2 = infoSacanner.nextInt();
        System.out.println("The number 2 enter is: "+number2);
        System.out.println("Choice one operation");
        System.out.println("1 - add");
        System.out.println("2 - subtract");
        System.out.println("3 - Divide");
        System.out.println("4 - Multiply");
        int operation = infoSacanner.nextInt();
        double choicedOperation = 0;
        switch (operation){
            case 1:
                choicedOperation = number1 + number2;
                break;
            case 2:
                choicedOperation = number1 - number2;
                break;
            case 3:
                choicedOperation = number1 / number2;
                break;
            case 4:
                choicedOperation = number1 * number2;
                break;
            default:
                System.out.println("invalid Operation");
        }
        System.out.println(choicedOperation);

     
    }

}
