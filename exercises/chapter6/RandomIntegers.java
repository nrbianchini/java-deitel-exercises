package exercises.chapter6;

import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args) {
        // o objeto randomNumbers produzirá números aleatórios
        SecureRandom randomNumbers = new SecureRandom();

        for (int counter = 1; counter <= 20; counter++) {
            /* para escolher o intervalo inicial a ser gerado,
            usa-se " " + a chamada da classe,
            já o (6) é a quantidade de valores a serem gerados */
            int face = 1 +  randomNumbers.nextInt(6);
            System.out.printf("%d ", face);

            /* se o contador for divísivel por 5, inicia-se
            uma nova linha, assim 20 números serão gerados */
            if (counter % 5 == 0){
                System.out.println();
            }
        }
    }
}
