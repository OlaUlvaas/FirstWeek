package se.lexicon.Ola;

/**
 * Ask user for three numbers, and counting the average of this three numbers.
 */

import java.util.Scanner;
public class Ex004_Average {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter a second number: ");
        int second = scanner.nextInt();
        System.out.println("Enter a third number: ");
        int third = scanner.nextInt();
        double average = (double)(first + second + third) / 3;
        System.out.println("The average of your numbers is: " + average);

        scanner.close();


    }

}
