package exercises.chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction_ChooseAProblem {

    public static int studentChoice(Scanner input) {
        System.out.printf("Enter the arithmetic problem of your choice:%n" +
                "(1) - Addition%n(2) - Subtraction%n" +
                "(3) - Multiplication%n(4) - Division%n" +
                "(5) - Random%n ");

        return input.nextInt();
    }

    public static int[] randomDigits() {
        SecureRandom randomNumber = new SecureRandom();
        int number1, number2;

        number1 = randomNumber.nextInt(9) + 1;
        number2 = randomNumber.nextInt(9) + 1;

        return new int[]{number1, number2};
    }

    public static void generateQuestions(int choice, int number1, int number2) {
        if (choice == 1) {
            System.out.printf("How much is %d plus %d? ", number1, number2);
        }
        else if (choice == 2) {
            System.out.printf("How much is %d minus %d? ", number1, number2);
        }
        else if (choice == 3) {
            System.out.printf("How much is %d times %d? ", number1, number2);
        }
        else if (choice == 4) {
            System.out.printf("How much is %d divided by %d? ", number1, number2);
        }
    }

    public static int checkAnswer(int choice, int number1, int number2) {

        if (choice == 1) {
            return number1 + number2;
        }
        else if (choice == 2) {
            return number1 - number2;
        }
        else if (choice == 3) {
            return number1 * number2;
        }
        else if (choice == 4) {
            return number1 / number2;
        }
        return 0;
    }

    public static void positiveComments() {
        SecureRandom randomNumber = new SecureRandom();
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

    public static void negativeComments (){
        SecureRandom randomNumber = new SecureRandom();
        int generatedComment = randomNumber.nextInt(4) + 1;
        switch (generatedComment) {
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
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // para que a instrução continue deve-se usar o boolean true
        while (true) {
            int choice = studentChoice(input);

            int[] numbers = randomDigits();
            int number1 = numbers[0];
            int number2 = numbers[1];

            generateQuestions(choice, number1, number2);
            int answer = input.nextInt();

            while (answer != checkAnswer(choice, number1, number2)) {
                negativeComments();
                answer = input.nextInt();
            }
            positiveComments();
        }
        }
    }