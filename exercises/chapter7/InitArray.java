package exercises.chapter7;

public class InitArray {
    public static void outputArray(int[][] array) {
        //percorre todas as linhas conforme o comprimento do array
        for (int row = 0; row < array.length; row++) {
            // percorre todas as colunas conforme o comprimento das linhas do array
            for (int column = 0; column < array[row].length; column++)
                System.out.printf("%d ", array[row][column]);

            System.out.println();
        }
    }

    public static void main(String[] args) {

        // array alinhados de mesmo comprimento
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        // array de diferentes comprimentos
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Values in array1 by row are: ");
        outputArray(array1);
        System.out.println("Values in array2 by row are: ");
        outputArray(array2);
    }
}
