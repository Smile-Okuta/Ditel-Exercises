package Chapter2Exercise;

import java.util.Scanner;

public class LargestAndSmallestIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


    }

    public int largest(int num1, int num2, int num3, int num4, int num5){
//        System.out.println("Enter 5 numbers: ");
//        num1 = input.nextInt();
//        num2 = input.nextInt();
//        num3 = input.nextInt();
//        num4 = input.nextInt();
//        num5 = input.nextInt();

        int largest = num1;
        if (num2 > largest){
            largest = num2;
        }
        if (num3 > largest){
            largest = num3;
        }
        if (num4 > largest){
            largest = num4;
        }
        if (num5 > largest){
            largest = num5;
        }



        int largestNumber = largest;

//        System.out.printf("The largest of your numbers is: %d%n", largest);
//        System.out.printf("The smallest of your numbers is: %d", smallest);
//        System.out.printf("The smallest and largest are %d and %d", smallestNumber, largestNumber);
        return largestNumber;
    }

    public int smallest(int num1, int num2, int num3, int num4, int num5){
        int smallest = num2;
        if (num1 < smallest){
            smallest = num1;
        }
        if(num3 < smallest){
            smallest = num3;
        }
        if(num4 < smallest){
            smallest = num4;
        }
        if(num5 < smallest){
            smallest = num5;
        }
        int smallestNumber = smallest;
        return smallestNumber;
    }
}
