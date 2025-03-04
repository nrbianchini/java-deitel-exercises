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
                    System.out.println("Muito bom!");
                    break;
                case 2:
                    System.out.println("Excelente!");
                    break;
                case 3:
                    System.out.println("Bom trabalho!");
                    break;
                case 4:
                    System.out.println("Mantenha um bom trabalho!");
                    break;
            }
        }
    }
    public static void generateQuestions(int generatedNumber1, int generatedNumber2) {
        System.out.print("Quanto é " + generatedNumber1 + " vezes " + generatedNumber2 + "? ");
    }
}