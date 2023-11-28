package Chapter6;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNum = input.nextInt();
        System.out.println("Enter second number");
        int secNum = input.nextInt();

        divisor(firstNum, secNum);

    }
    private static void divisor(int num1, int num2){

        int large = num1;
                if (num2 > large){
                    large = num2;
                }
        int i ;
        for ( i = 1; i < large; i++) {

            }
        if(num1 % i == 0 && num2 % i == 0){
            System.out.println(i + " Is your Greatest common Divisor");
        }else {
            System.out.println("No number lesser than your largest " +
                    "number can evenly divide both numbers");
    }

    }
}
