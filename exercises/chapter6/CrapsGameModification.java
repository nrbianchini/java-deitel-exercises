package exercises.chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsGameModification {
    private static final SecureRandom randomNumbers = new SecureRandom();

    // tipo enum com constantes que representem o estado do jogo
    private enum Status {CONTINUE, WON, LOST}

    // constantes que representam lançamentos comuns dos dados
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static int wagerPlacement (int bankBalance){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your wager: ");
        int wager = input.nextInt();

        while (wager > bankBalance) {
            System.out.print("Please enter your wager: ");
            wager = input.nextInt();
        }
        return wager;
    }

    // lança os dados, calcula a soma e exibe os resultados
    public static int rollDice () {

        // seleciona valores aleatórios do dado
        int die1 = 1 + randomNumbers.nextInt(6); // primeiro lançamento do dado
        int die2 = 1 + randomNumbers.nextInt(6); // segundo lançamento do dado

        int sum = die1 + die2; // soma dos valores dos dados

        // exibe os resultados desse lançamento
        System.out.printf("Player rolled %d + %d = %d%n",
                die1, die2, sum);

        return sum;
    }

    public static void playerConversation () {
        int playerConversation = 1 + randomNumbers.nextInt(4);
        {
            switch (playerConversation) {
                case 1 -> System.out.println("Sorry. You busted!");
                case 2 -> System.out.println("Oh, you're going for broke, huh?");
                case 3 -> System.out.println("Aw c'mon take a chance!");
                case 4 -> System.out.println("You're up big. Now's the time to cash in your chips!");
            }
        }
    }

    // joga uma partida de craps
    public static void main(String[] args) {
        int myPoint = 0; // pontos se não ganhar ou perder na 1.ª rolagem
        Status gameStatus; // pode conter CONTINUE, WON, LOST

        int sumOfDice = rollDice(); // primeira rolagem dos dados
        int bankBalance = 1000;
        int wager = wagerPlacement(bankBalance);

        switch (sumOfDice) {
            case SEVEN: // ganha com 7 no primeiro lançamento
            case YO_LEVEN: // ganha com 11 no primeiro lançamento
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES: // perde com 2 no primeiro lançamento
            case TREY: // perde com 3 no primeiro lançamento
            case BOX_CARS: // perde com 12 no primeiro lançamento
                gameStatus = Status.LOST;
                break;
            default: // não ganhou nem perdeu, portanto, registra a pontuação
                gameStatus = Status.CONTINUE; // jogo não terminou
                myPoint = sumOfDice; // informa a pontuação
                System.out.printf("Point is: %d%n", myPoint);
        }

        // enquanto o jogo não estiver completo
        while (gameStatus == Status.CONTINUE) { // nem WON nem LOST
            sumOfDice = rollDice(); // lança os dados novamente

            // determina o estado do jogo
            if (sumOfDice == myPoint) // vitória por pontuação
                gameStatus = Status.WON;
            else if (sumOfDice == SEVEN) // perde obtendo 7 antes de atingir a pontuação
                gameStatus = Status.LOST;
        }

        // exibe uma mensagem ganhou ou perdeu
        if (gameStatus == Status.WON) {
            bankBalance += wager;
            System.out.printf("Player wins%nUpdated bank balance: " + bankBalance);
        } else {
            bankBalance -= wager;
            System.out.printf("Player loses%nUpdated bank balance: " + bankBalance);
            playerConversation();
        }
    }
    }
