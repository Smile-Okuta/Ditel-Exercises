package Chapter5;

import java.util.Scanner;

public class IntegersDivisibleBy3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int div = 0;

        System.out.println("How many values would you like to input?: ");
        int value = input.nextInt();

        int num;
        int number = 0;
        for (num = 1; num <= value; num++) {
            System.out.println("Enter numbers between 1 - 30: ");
            number = input.nextInt();

            if (number > 30) {
                System.out.println("Wrong!!! input numbers between 1 - 30");
            }
        }

        if (number % 3 == 0) {
            System.out.printf("%d  ", number);
            div += number;
        }

        System.out.printf("The sum of integer divisible by 3 is : %d", div);
    }
}
