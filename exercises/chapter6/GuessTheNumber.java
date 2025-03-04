package exercises.chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom randomNumber = new SecureRandom();

        boolean playAgain = true;

        while (playAgain) {
            int generatedNumber = randomNumber.nextInt(1000) + 1;
            //System.out.printf("%d ", generatedNumber);

            int guess = 0;
            int counter = 0;

            while (guess != generatedNumber) {
                System.out.print("Enter your guess between 1 to 1000: ");
                guess = input.nextInt();
                counter++;

                if (guess > generatedNumber) {
                    System.out.println("Too high. Try again.");
                } else if (guess < generatedNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Congratulations. You guessed the number.");
                }
            }

            if (counter < 10) {
                System.out.println("Either you know the secret or you got lucky!");
            }
            else if (counter == 10) {
                System.out.println("Aha! You know the secret!");
            }
            else {
                System.out.println("You should be able to do better!");
            }

            System.out.println("\nEnter 1 to play again: ");
            int response = input.nextInt();

            if (response != 1) {
                playAgain = false;
            }
        }
    }
}
