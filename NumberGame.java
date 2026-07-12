import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1; // Random number between 1 and 100
        int guess=0;
        int attempts = 0;
        int maxAttempts = 10;

        System.out.println("===== NUMBER GUESSING GAME =====");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have " + maxAttempts + " attempts.");

        while (attempts < maxAttempts) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess == number) {
                System.out.println(" Congratulations! You guessed the number.");
                System.out.println("Attempts taken: " + attempts);
                break;
            } else if (guess < number) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Too High!");
            }

            System.out.println("Attempts Left: " + (maxAttempts - attempts));
        }

        if (attempts == maxAttempts && number != guess) {
            System.out.println("\nGame Over!");
            System.out.println("The correct number was: " + number);
        }

        sc.close();
    }
}