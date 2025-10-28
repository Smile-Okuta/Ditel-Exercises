package Chapter4;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1 == num2){
            System.out.println("0");
        } else if (num1 > num2) {
            System.out.println("1");
        } else {
            System.out.println("-1");
        }
    }
}
