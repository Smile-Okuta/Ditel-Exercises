package Chapter6;

import java.util.Scanner;

public class ParkingChargesMain {
    public static void main(String[] args) {
        ParkingCharges parkingCharges = new ParkingCharges();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Parking time: ");
        int time = input.nextInt();
        parkingCharges.setHour(time);

        System.out.printf("Your parking cost is: %.2f%n", parkingCharges.getMinimumFee());
    }
}
