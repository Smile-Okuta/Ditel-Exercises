package Chapter6;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = input.nextInt();

        isPerfect(num);

    }

    public static void isPerfect(int number) {

        System.out.println("Your number is: " + number);
        System.out.println("Factors of your number are: ");
        int i;
        int val =0;
        for (i = 1; i < number; i++) {
            if(number % i == 0) {
                System.out.println(i);
                val += i;
            }
        }
        if (val == number){
            System.out.println("Your number is perfect");
        }else {
            System.out.println("your number is not perfect");
        }





    }
}
