package Chapter2Exercise;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int square1 = num1 * num1;
        int square2 = num2 * num2;

        int sumSquare = square1 + square2;

        int diffSquare = square1 - square2;


        System.out.println("Square of your numbers are "+ square1 +" and " + square2);
        System.out.printf("The addition of the squares is: %d\n", sumSquare);
        System.out.printf("The difference of the square is: %d\n", diffSquare);
    }
}
