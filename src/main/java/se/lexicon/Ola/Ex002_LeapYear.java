package se.lexicon.Ola;

/**
 * Ask for a year for input. Print out if it´s a leap year or not.
 */
import java.util.Scanner;

public class Ex002_LeapYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What year are we talking about?: ");

        int year = scanner.nextInt();

        if(year % 4 == 0){
            System.out.println("It's a Leap year.");
        }
        else{
            System.out.println("Not a Leap year.");
        }
        scanner.close();
    }
}