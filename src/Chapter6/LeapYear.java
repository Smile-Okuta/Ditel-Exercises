package Chapter6;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        System.out.println("Enter your year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        isLeapYear(year);
    }

    public static void isLeapYear(int num){
        if (num % 400 == 0 || (num % 4 == 0 && num % 100 != 0)){
            System.out.println("This is a leap year");
        }else {
            System.out.println("Not a leap year");
        }

    }
}
