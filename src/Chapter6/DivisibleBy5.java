package Chapter6;

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter numbers divisible by 5: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("number " + i + ":");
            int value = input.nextInt();
            DivisibleBy5.isDivisible(value);
        }

    }

    public static int isDivisible(int num){
//        for (int i = 1; i <= 10 ; i++) {
            System.out.println(num % 5 == 0);
//        }

    return num;
    }
}
