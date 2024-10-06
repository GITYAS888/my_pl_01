import java.util.Random;
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(11);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Guess a number:");
            int guess = scanner.nextInt();
           

            if (guess < 0 || guess > 10){
                System.out.println("Please guess a number between 0 and 10.");

            } else if (guess < numberToGuess){
                System.out.println("Guess was too low");
            } else if ( guess > numberToGuess){
                System.out.println("Guess was too high");
            } else {
                System.out.println("SUCESS");
                break;
            }

        }

        scanner.close();
    }
}