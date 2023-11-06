package Chapter6;

import java.util.Scanner;

public class TemperatureConversions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What temperature do you wish to check?\n" +
                "Input 1 for Kelvin Temperature or 2 for Celsius Temperature");

        int temp = input.nextInt();

        if (temp == 1){
            System.out.println("Enter your Celsius Temperature: ");
            double celTemp = input.nextDouble();
            System.out.printf("Your Kelvin Temperature is: %.4f",kelvin(celTemp));
        } else if (temp == 2) {
            System.out.println("Enter your Kelvin Temperature: ");
            double kelTemp = input.nextDouble();
            System.out.printf("Your Celsius Temperature is: %.4f",celsius(kelTemp));
        }
    }



    private static double kelvin(double num){
        return num + 273.15;
    }
    private static double celsius(double num){
        return num - 273.15;
    }
}
