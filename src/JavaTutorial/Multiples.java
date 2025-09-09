package JavaTutorial;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = input.nextInt();

        for (int i = 1; i <=12; i++){
            System.out.println(i + " * " + num + " = " + i * num);
        }


    }
}
