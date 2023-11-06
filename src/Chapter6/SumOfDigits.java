package Chapter6;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 4 digit integer: ");
        int num = sumDigits(input.nextInt());

        System.out.printf("The sum of your digit is %d",num);
    }
    public static int sumDigits(int numbers){
        int fourthNum = numbers % 10;
        int thirdNum = (numbers / 10) % 10;
        int secondNum = (numbers / 100) % 10;
        int firstNum = (numbers / 1000);
        return firstNum + secondNum + thirdNum + fourthNum;
    }
}
