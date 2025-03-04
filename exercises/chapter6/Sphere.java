package exercises.chapter6;

import java.util.Scanner;

public class Sphere {
    public static double sphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius of sphere: ");
        double radius = input.nextDouble();

        System.out.printf("Volume is: %.2f", sphereVolume(radius));
    }
}
