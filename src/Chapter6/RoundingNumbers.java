package Chapter6;

import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number: ");
        double num = input.nextDouble();
        double y = Math.floor(num);
        System.out.println(y);

        double x = Math.floor(num * 100 + 0.5) / 100;
        System.out.println(x);

        double z = Math.floor(num * 10 + 0.5)/ 10;
        System.out.println(z);

        double s = Math.floor(num * 1000 + 0.5) /1000;
        System.out.println(s);
    }
}
