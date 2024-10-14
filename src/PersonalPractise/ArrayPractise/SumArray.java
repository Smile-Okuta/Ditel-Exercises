package PersonalPractise.ArrayPractise;

import java.util.Arrays;
import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//
//        int sum = 0;
//        int[] array = {2,5,7,12,9};
//
//        for ( int num : array) {
//            sum += num;
//        }
//        System.out.println(sum);

        int sum = 0;
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter 10 numbers: ");
            array[i] += input.nextInt();
            sum += array[i];
        }
        System.out.println(sum);


    }
}
