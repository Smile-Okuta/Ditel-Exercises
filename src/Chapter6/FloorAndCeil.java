package Chapter6;

import java.util.Scanner;

public class FloorAndCeil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        double num = input.nextDouble();
        System.out.println("The largest integer that is closer to your number is: " + myFloor(num));
        System.out.println("The smallest integer that is greater than your number is: " + myCeil(num));

    }

    public static int myFloor(double num) {
       int i = (int) num * 10;

        return  i / 10;

    }

    public static int myCeil(double num){
        int i = (int) num * 10;

        return  (i / 10) + 1;
    }
}
