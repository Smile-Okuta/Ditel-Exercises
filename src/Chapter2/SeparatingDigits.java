package Chapter2;

import java.util.Scanner;

public class SeparatingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 4 digits: ");
        int num = input.nextInt();

        int fifthDigit = num % 10;
        int fourthDigit = (num % 100) / 10;
        int thirdDigit = (num % 1000) / 100;
        int secDigit = (num % 10000) / 1000;

        System.out.print(fifthDigit + fourthDigit + thirdDigit + secDigit);

    }
}
