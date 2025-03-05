package exercises.chapter7;

public class InitArray {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10; // declara constante
        int[] array = new int[ARRAY_LENGTH]; // cria o array

        // calcula o valor de cada elemento do array
        for (int counter = 0; counter < array.length; counter++)
            array[counter] = 2 + 2 * counter;

        System.out.printf("%s%8s%n", "Index", "Value");

        // gera saída do valor de cada elemento do array
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
    }
}
