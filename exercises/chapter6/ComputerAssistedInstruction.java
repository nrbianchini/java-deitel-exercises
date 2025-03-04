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
                System.out.println("Não. Por favor, tente de novo.");
                answer = input.nextInt();
            }
                System.out.println("Muito bom!");
          }

    public static void generateQuestions(int generatedNumber1, int generatedNumber2) {
        System.out.print("Quanto é " + generatedNumber1 + " vezes " + generatedNumber2 + "? ");
    }
}
