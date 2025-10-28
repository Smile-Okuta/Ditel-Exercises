package Chapter4;

import java.util.Scanner;

public class ReadingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        System.out.println("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter your other numbers: ");

        while (true){
            int num2 = input.nextInt();

            total += num2;

           if (total >= num1){
               System.out.println("Jackpot !!!");
               break;
           }



        }
    }


}
