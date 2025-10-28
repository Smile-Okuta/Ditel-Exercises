package Chapter4;

import java.util.Scanner;

public class ValidateInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true){

            System.out.println("Enter a value between 1 and 2");
            int num = input.nextInt();

            if (num == 1 || num == 2){
                System.out.println("valid number");
                break;
            }

        }

    }
}
