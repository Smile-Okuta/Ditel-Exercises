package Chapter6;

import java.util.Scanner;

public class MultiplesMain {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Input your first number: ");
        int num1 = input.nextInt();
        System.out.println("Input your second number");
        int num2= input.nextInt();

        System.out.println(Multiples.isMultiples(num1,num2));

    }
}
