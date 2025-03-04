package exercises.chapter6;

import java.util.Scanner;

public class ParkingFee {
    public static double calculateCharges(double hours) {
        double charge;

        if (hours == 24) {
            charge = 10.00;
            return charge;
        }
        else if (hours <= 3){
            charge = 2.00;
            return charge;
        }
        else {
            double extraHours = Math.ceil(hours - 3);
            charge = extraHours * 0.5;
            return charge + 2.00;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalReceipts = 0.0;
        System.out.print("Enter how many clients you had yesterday: ");
        int clients = input.nextInt();

        for (int counter = 1; counter <= clients; counter++){
            System.out.printf("%nBilling for customer " + counter);
            System.out.printf("%nEnter the number of hours parked: ");
            double hours = input.nextDouble();

            double charge = calculateCharges(hours);
            totalReceipts += charge;

            System.out.printf("Hours parked: %.2f%nCharge: $%.2f%n", hours, charge);
            System.out.printf("Total receipts so far: $%.2f%n", totalReceipts);
        }

        System.out.printf("%nTotal: $" + totalReceipts);
    }
}