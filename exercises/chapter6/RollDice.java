package exercises.chapter6;

import java.security.SecureRandom;

public class RollDice {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;

        for (int roll = 1; roll <= 6000000; roll++){
            int face = 1 + randomNumbers.nextInt(6);

            switch (face){
                case 1:
                    frequency1++;
                    break;
                case 2:
                    frequency2++;
                    break;
                case 3:
                    frequency3++;
                    break;
                case 4:
                    frequency4++;
                    break;
                case 5:
                    frequency5++;
                    break;
                case 6:
                    frequency6++;
                    break;
            }
        }
        System.out.println("Face\tFrequency");
        System.out.printf("1\t%11d%n2\t%11d%n3\t%11d%n4\t%11d%n5\t%11d%n6\t%11d%n",
                frequency1, frequency2, frequency3, frequency4, frequency5, frequency6);
    }
}
