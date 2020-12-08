package se.lexicon.Ola;

/**
 *
 */
import java.util.Scanner;
import java.util.Random;

public class Ex008_RandomNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(500) + 1;
        System.out.println("Welcome to GUESSING GAME, you have to find the right number.\nIt´s between 1 and 500: ");
        int guess = 0;
        int count = 0;

        while(guess != number){
            System.out.println("Guess a number: ");
            guess =scanner.nextInt();
            count++;

            if(guess == number){
                System.out.println("Congratulations");
            }
            else if(guess < number){
                System.out.println("Your guess was too small");
            }
            else{
                System.out.println("Your guess was too big");
            }
        }
        System.out.println("You guessed the right number in " + count + " tries");

        scanner.close();


    }
}
