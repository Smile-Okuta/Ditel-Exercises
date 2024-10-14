package PersonalPractise.ArrayPractise;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int[] array = new int[10];

        for (int i = 0; i <array.length; i++){
            array[i] = input.nextInt();
        }

        System.out.println("Original integers" + Arrays.toString(array) + " ");

        Arrays.sort(array);

        System.out.print("Sorted Integers" + Arrays.toString(array) +" ");
    }
}
