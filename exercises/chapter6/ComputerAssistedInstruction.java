package exercises.chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom randomNumber = new SecureRandom();

            int generatedNumber1 = randomNumber.nextInt(9) + 1;
            int generatedNumber2 = randomNumber.nextInt(9) + 1;
            int multiply = generatedNumber1 * generatedNumber2;

            generateQuestions(generatedNumber1, generatedNumber2);
            int answer = input.nextInt();

            while (answer != multiply) {
                System.out.println("No. Please, try again.");
                answer = input.nextInt();
            }
                System.out.println("Very good!");
          }

    public static void generateQuestions(int generatedNumber1, int generatedNumber2) {
        System.out.print("How much is " + generatedNumber1 + " times " + generatedNumber2 + "? ");
    }
}
