package Chapter2;

import java.util.Scanner;

public class BMIcalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight in KG: ");
        System.out.println("Ënter your height in Meters: ");

        int weight = input.nextInt();
        int height = input.nextInt();

        int bmiCal = weight / (height * height);

        System.out.println("Your BMI is: " + bmiCal);



    }
}
