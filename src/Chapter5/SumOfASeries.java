package Chapter5;

import java.util.Scanner;

public class SumOfASeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your starting number range: ");
        int firstRange = input.nextInt();
        System.out.println("Enter your ending number range: ");
        int secondRange = input.nextInt();


        long i;
        long sum = 0;
        for (i = 1; i <= secondRange; i++) {
            sum = sum + i;

        }
        System.out.printf("Sum of the digit in numbers from %d to %d = %d", firstRange, secondRange, sum);
    }
}
