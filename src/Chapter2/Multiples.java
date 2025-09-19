package Chapter2;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter second number: ");
        int number2 = input.nextInt();

        int multiple3 = number1 * 3;
        int multiple2 = number2 * 2;


        if (multiple3 % multiple2 == 0){
            System.out.printf("Your first number %d tripled is a multiple of your second number %d doubled", number1, number2);
        }else
                System.out.printf("Your first number %d tripled is *NOT* a multiple of your second number %d doubled", number1, number2);




    }
}
