package se.lexicon.Ola;

/**
 * Asks for two numbers as input. These are added, asking for two new numbers.
 * These are subtracted, asking for two more numbers.
 * These are multiplied and finally ask for two more numbers and these are divided.
 */

import java.util.Scanner;

public class Ex003_CountingTwoNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***ADDITION***");
        System.out.println("Enter a number: ");
        int number1 = scanner.nextInt();
        System.out.println("And one more number: ");
        int number2 = scanner.nextInt();
        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));

        System.out.println("***SUBTRACTION***");
        System.out.println("Enter a number: ");
        int number3 = scanner.nextInt();
        System.out.println("And one more number: ");
        int number4 = scanner.nextInt();
        System.out.println(number3 + " - " + number4 + " = " + (number3 - number4));

        System.out.println("***MULTIPLICATION***");
        System.out.println("Enter a number: ");
        int number5 = scanner.nextInt();
        System.out.println("And one more number: ");
        int number6 = scanner.nextInt();
        System.out.println(number5 + " * " + number6 + " = " + (number5 * number6));

        System.out.println("***DIVISION***");
        System.out.println("Enter a number: ");
        double number7 = scanner.nextInt();
        System.out.println("And one more number: ");
        double number8 = scanner.nextInt();
        if(number8 == 0){
            System.out.println("NO NO NO - That´s forbidden!");
        }
        else{
            System.out.println(number7 + " / " + number8 + " = " + (number7 / number8));
        }
        scanner.close();



    }
}

