package Chapter4;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int largest = Integer.MIN_VALUE;
        System.out.println("Enter 10 numbers: ");

        while (counter <= 10){


            int num = input.nextInt();

            if (num > largest){
                largest = num;
            }



            counter++;

        }

        System.out.println("Largest is : " + largest);


    }


}
