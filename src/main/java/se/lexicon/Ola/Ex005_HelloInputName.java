package se.lexicon.Ola;

/**
 * Ask user to enter his or her name.
 * Then print out "Hello" on one line and "Users name" on the next line.
 */

import java.util.Scanner;
public class Ex005_HelloInputName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + "\n" + name);

        scanner.close();
    }



}
