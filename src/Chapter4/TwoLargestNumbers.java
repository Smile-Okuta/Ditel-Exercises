package Chapter4;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int count = 1;

        System.out.println("Enter 10 numbers: ");

        while (count <= 5){

            int num = input.nextInt();

            if (num > largest){
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }


            count++;


        }

        System.out.println("Your largest number is : "+ largest);
        System.out.println("Your second largest is: "+ secondLargest);


    }

}
