import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        int score = 100;
        boolean win = false;

        System.out.println("Welcome to Guess the Number game!");
        System.out.println("The computer has generated a number between 1 and 100.");
        System.out.println("You have 10 attempts to guess the number.");

        while (attempts < 10) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            attempts++;

            if (guess == numberToGuess) {
                win = true;
                break;
            }
            else if (guess < numberToGuess) {
                System.out.println("The number is higher.");
            }
            else {
                System.out.println("The number is lower.");
            }
        }

        if (win) {
            System.out.println("Congratulations! You have won the game.");
            System.out.println("You took " + attempts + " attempts.");
            score -= attempts * 10;
            System.out.println("Your score is " + score + ".");
        }
        else {
            System.out.println("Unfortunately, you have lost the game.");
            System.out.println("The number was " + numberToGuess + ".");
        }
    }
}
