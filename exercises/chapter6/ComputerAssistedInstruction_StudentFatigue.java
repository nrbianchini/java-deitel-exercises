package exercises.chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction_StudentFatigue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom randomNumber = new SecureRandom();

        // para que a instrução continue deve-se usar o boolean true
        while (true) {
            // dentro do while geram-se os números
            int generatedNumber1 = randomNumber.nextInt(9) + 1;
            int generatedNumber2 = randomNumber.nextInt(9) + 1;
            int multiply = generatedNumber1 * generatedNumber2;

            generateQuestions(generatedNumber1, generatedNumber2);
            int answer = input.nextInt();

            while (answer != multiply) {
                int generatedComment = randomNumber.nextInt(4) + 1;
                switch (generatedComment){
                    case 1:
                        System.out.println("No. Please, try again.");
                        break;
                    case 2:
                        System.out.println("Wrong. Try one more time.");
                        break;
                    case 3:
                        System.out.println("Don't give up!");
                        break;
                    case 4:
                        System.out.println("No. Keep trying.");
                        break;
                }
                answer = input.nextInt();

            }
            // automáticamente depois do muito bem é gerado
            // outro valor e o loop prossegue
            int generatedComment = randomNumber.nextInt(4) + 1;
            switch (generatedComment) {
                case 1:
                    System.out.println("Very good!\n");
                    break;
                case 2:
                    System.out.println("Excellent!\n");
                    break;
                case 3:
                    System.out.println("Good job!\n");
                    break;
                case 4:
                    System.out.println("Keep up the good work!\n");
                    break;
            }
        }
    }
    public static void generateQuestions(int generatedNumber1, int generatedNumber2) {
        System.out.print("How much is " + generatedNumber1 + " times " + generatedNumber2 + "? ");
    }
}