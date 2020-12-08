package se.lexicon.Ola;

/**
 * Ask user to enter two numbers.
 * Calculate different calculation methods on this numbers.
 */

import java.util.Scanner;

public class Ex006_DifferentCalculationMethods {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int second = scanner.nextInt();
        double div1 = (double)first;
        double div2 = (double)second;
        System.out.println("***ADDITION***");
        System.out.println(first + " + " + second + " = " + (first + second));
        System.out.println("***SUBTRACTION***");
        System.out.println(first + " - " + second + " = " + (first - second));
        System.out.println("***MULTIPLICATION***");
        System.out.println(first + " * " + second + " = " + (first * second));
        System.out.println("***DIVISION***");
        if(div2 == 0){
            System.out.println("NO NO NO - Absolutely forbidden!");
        }
        else{
            System.out.println(first + " / " + second + " = " + (div1 / div2));
        }


        scanner.close();
    }

}
