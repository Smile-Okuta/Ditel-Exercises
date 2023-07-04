package Chapter2Exercise;

import java.util.Scanner;

public class ArithmeticSmallestAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int sum = num1 + num2 + num3;
        int average = sum/3;
        int product = num1 * num2 * num3;

        int largest = num1;
        if (num2 > largest){
            largest = num2;
        } if (num3 > largest) {
            largest = num3;
        }

        int smallest = num2;
        if (num1 < smallest){
            smallest = num1;
        } if (num3 < smallest) {
            smallest = num3;
        }


        System.out.printf("Your numbers are: %d, %d & %d%n", num1, num2, num3);
        System.out.printf("The sum of your numbers is: %d%n", sum);
        System.out.printf("The average of your numbers is: %d%n", average);
        System.out.printf("The product of your numbers is: %d%n", product);
        System.out.printf("The smallest of your numbers is: %d%n", smallest);
        System.out.printf("The largest of your numbers is: %d", largest);
    }
}
