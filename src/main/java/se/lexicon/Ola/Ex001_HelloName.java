package se.lexicon.Ola;

/**
 * Excersise # 1
 * Ask for your name as input. Then print out "Hello" on one line and "The name" on next line.
 */

import java.util.Scanner;
public class Ex001_HelloName {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name= scanner.nextLine();
        System.out.println("Hello " + "\n" + name);
        scanner.close();
    }


}
