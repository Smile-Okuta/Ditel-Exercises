package Chapter6;

import java.util.Scanner;

public class HypotenuseCalcultions {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter Triangle side 1: ");
        double firstSide = input.nextDouble();
        System.out.println("Enter Triangle side 2");
        double secondSide = input.nextDouble();

        System.out.println();
        System.out.printf("Your result is: %.2f", Math.hypot(firstSide,secondSide));
    }
}
