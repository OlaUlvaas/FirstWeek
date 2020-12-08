package se.lexicon.Ola;

/**
 * Convert seconds to hours, minutes and seconds;
 */
import java.util.Scanner;
public class Ex007_ConvertSeconds {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many seconds?: ");
        int input = scanner.nextInt();
        int hours = input / 3600;
        int minutes = (input % 3600) / 60;
        int seconds = (input % 3600) % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
        scanner.close();
    }
}
