package exercises.chapter6;

import java.util.Scanner;

public class CalculateHypotenuse {
    public static double hypotenuse(double side1, double side2) {
        return Math.hypot(side1, side2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side 1 and side 2: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();

        System.out.print(hypotenuse(side1, side2));
    }
}
