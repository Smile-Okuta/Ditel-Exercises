package Chapter2Exercise;

import java.util.Scanner;

public class NegativeValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input 5 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();


        if (num1 == 0){
            System.out.printf("%d is Zero%n", num1);
        }
        if (num1 < 0){
            System.out.printf("%d is a negative number%n", num1);
        }
        if (num1 > 0){
            System.out.printf("%d is a positive number%n", num1);
        }


        if (num2 == 0){
            System.out.printf("%d is Zero%n", num2);
        }
        if (num2 < 0){
            System.out.printf("%d is a negative number%n", num2);
        }
        if (num2 > 0){
            System.out.printf("%d is a positive number%n", num2);
        }


        if (num3 == 0){
            System.out.printf("%d is Zero%n", num3);
        }
        if (num3 < 0){
            System.out.printf("%d is a negative number%n", num3);
        }
        if (num3 > 0){
            System.out.printf("%d is a positive number%n", num3);
        }


        if (num4 == 0){
            System.out.printf("%d is Zero%n", num4);
        }
        if (num4 < 0){
            System.out.printf("%d is a negative number%n", num4);
        }
        if (num4 > 0){
            System.out.printf("%d is a positive number%n", num4);
        }


        if (num5 == 0){
            System.out.printf("%d is Zero%n", num5);
        }
        if (num5 < 0){
            System.out.printf("%d is a negative number%n", num5);
        }
        if (num5 > 0){
            System.out.printf("%d is a positive number%n", num5);
        }

    }
}
