package exercises.chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction_DifficultyLevels {

    public static int studentChoice(Scanner input) {
        System.out.printf("Enter the difficulty level of your choice:%n" +
                "(1) - One digit numbers%n(2) - Two digits number%n(3) - Three digits number%n ");
        int choice = input.nextInt();

        return choice;
    }

    public static int[] randomDigits(int choice) {
        SecureRandom randomNumber = new SecureRandom();
        int number1 = 0;
        int number2 = 0;

        switch (choice) {
            case 1:
                number1 = randomNumber.nextInt(9) + 1;
                number2 = randomNumber.nextInt(9) + 1;
                break;
            case 2:
                number1 = randomNumber.nextInt(90) + 10;
                number2 = randomNumber.nextInt(90) + 10;
                break;
            case 3:
                number1 = randomNumber.nextInt(900) + 100;
                number2 = randomNumber.nextInt(900) + 100;
                break;
        }
        return new int[]{number1, number2};
    }

    public static void generateQuestions(int number1, int number2) {
        System.out.printf("Quanto é %d vezes %d? ", number1, number2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom randomNumber = new SecureRandom();

        // para que a instrução continue deve-se usar o boolean true
        while (true) {
            int choice = studentChoice(input);

            int[] numbers = randomDigits(choice);
            int number1 = numbers[0];
            int number2 = numbers[1];

            int multiply = number1 * number2;

            generateQuestions(number1, number2);
            int answer = input.nextInt();

            while (answer != multiply) {
                int generatedComment = randomNumber.nextInt(4) + 1;
                switch (generatedComment){
                    case 1:
                        System.out.println("Não. Por favor, tente de novo.");
                        break;
                    case 2:
                        System.out.println("Errado. Tente mais uma vez.");
                        break;
                    case 3:
                        System.out.println("Não desista!");
                        break;
                    case 4:
                        System.out.println("Não. Continue tentando.");
                        break;
                }
                answer = input.nextInt();

            }
            // automáticamente depois do muito bem é gerado
            // outro valor e o loop prossegue
            int generatedComment = randomNumber.nextInt(4) + 1;
            switch (generatedComment) {
                case 1:
                    System.out.println("Muito bom!\n");
                    break;
                case 2:
                    System.out.println("Excelente!\n");
                    break;
                case 3:
                    System.out.println("Bom trabalho!\n");
                    break;
                case 4:
                    System.out.println("Mantenha um bom trabalho!\n");
                    break;
            }
        }
    }
}