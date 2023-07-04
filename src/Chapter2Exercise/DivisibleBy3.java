package Chapter2Exercise;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = input.nextInt();

        if (num % 3 == 0){
            System.out.println("Your number " + num + " is divisible by 3");
        }else System.out.println("Your number is not divisible by 3");
    }
}
