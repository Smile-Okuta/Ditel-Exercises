package Chapter4;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true){
            System.out.print("Enter 5 numbers: ");
            int num = input.nextInt();

            if (num > 99999 || num <= 9999){
                System.out.println("Your number is not 5 digits");
            } else {

                int first = num % 10;
                int second = (num % 100) / 10;
                int third = (num % 1000) / 100;
                int fourth = (num % 10000) / 1000;
                int fifth = (num / 10000);

                if (first == fifth  && second == fourth){
                    System.out.printf("%nYour number '%d' is a Palindrome", num);
                    break;
                }else {
                    System.out.println("Your number is not a Palindrome");

                }

            }

        }


    }
}