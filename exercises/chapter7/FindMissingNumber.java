package exercises.chapter7;

import java.security.SecureRandom;

public class FindMissingNumber {
    private static final int N = 100;

    public static void fillArray(int[] array, int[] removed) {
        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = counter + 1;
        }

        SecureRandom randomNumber = new SecureRandom();
        int removedIndex = randomNumber.nextInt(N) + 1;
        removed[0] = array[removedIndex - 1];

        array[removedIndex - 1] = 0;
    }

    public int findMissingNumber(int[] array) {
        int expectedSum = (N * (N + 1)) / 2;
        int actualSum = 0;

        for (int counter = 0; counter < array.length; counter++) {
            actualSum += array[counter];
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] array = new int[N];
        int[] removed = new int[1];

        FindMissingNumber finder = new FindMissingNumber();
        fillArray(array, removed);

        int missingNumber = finder.findMissingNumber(array);

        System.out.println("Removed number: " + removed[0]);
        System.out.println("So, the missing number is: " + missingNumber);
    }
}
