package Chapter2;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNum = input.nextInt();

        System.out.println("Enter second Number: ");
        int secNumber = input.nextInt();

        if (firstNum == secNumber){
            System.out.printf("%d == %d%n", firstNum, secNumber);
        }

        if (firstNum != secNumber){
            System.out.printf("%d != %d%n", firstNum, secNumber);
        }

        if (firstNum < secNumber){
            System.out.printf("%d < %d%n", firstNum, secNumber);
        }

        if (firstNum > secNumber){
            System.out.printf("%d > %d%n", firstNum, secNumber);
        }

        if (firstNum <= secNumber){
            System.out.printf("%d <= %d%n", firstNum, secNumber);
        }

        if (firstNum >= secNumber){
            System.out.printf("%d >= %d%n", firstNum, secNumber);
        }



    }
}
