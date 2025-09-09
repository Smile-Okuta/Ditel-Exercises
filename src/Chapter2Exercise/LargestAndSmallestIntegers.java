package Chapter2Exercise;

import java.util.Scanner;

public class LargestAndSmallestIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 numbers: ");
        int num1= input.nextInt();
     int  num2 = input.nextInt();
        int num3 = input.nextInt();
      int  num4 = input.nextInt();
        int num5 = input.nextInt();


        int largest = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5))));
        int smallest = Math.min(num1, Math.min(num2, Math.min(num3, Math.min(num4, num5))));

        System.out.printf("The largest of your numbers is: %d%n",  largest);
        System.out.printf("The smallest of your numbers is: %d", smallest);


    }

//    public static int largest(int num1, int num2, int num3, int num4, int num5){
//
//        int largest = num1;
//        if (num2 > largest){
//            largest = num2;
//        }
//        if (num3 > largest){
//            largest = num3;
//        }
//        if (num4 > largest){
//            largest = num4;
//        }
//        if (num5 > largest){
//            largest = num5;
//        }
//
//
//        return largest;
//    }
//
//    public static int smallest(int num1, int num2, int num3, int num4, int num5){
//        int smallest = num2;
//        if (num1 < smallest){
//            smallest = num1;
//        }
//        if(num3 < smallest){
//            smallest = num3;
//        }
//        if(num4 < smallest){
//            smallest = num4;
//        }
//        if(num5 < smallest){
//            smallest = num5;
//        }
//        return smallest;
//    }
}
