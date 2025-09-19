package Chapter2;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        int numSquare = num * num;

        System.out.printf("Your number is: %d and the square of your number is %d%n", num, numSquare);

        if(num > 100 && numSquare > 100){
            System.out.printf("%d > 100 & %d > 100 %n", num, numSquare);
        }
        if (num == 100 && numSquare == 100){
            System.out.printf("%d == 100 & %d == 100 %n", num, numSquare);
        }
        if(num != 100 && numSquare != 100){
            System.out.printf("%d != 100 & %d != 100 %n", num, numSquare);
        }
        if (num < 100 && numSquare < 100){
            System.out.printf("%d < 100 & %d < 100 %n", num, numSquare);
        }

    }
}
