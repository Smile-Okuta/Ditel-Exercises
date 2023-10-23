package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int[] array = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        System.out.println("Original array "+ Arrays.toString(array));

        for(int i = 0; i < array.length; i++){
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            array[i] = number;
        }

        System.out.println("Eliminated Duplicate Array "+
                eliminateDuplicate(array));

    }

    public static int[] eliminateDuplicate(int[] array){
        int[] result = null;
        int count = 0;
        for(int i = 0; i < array.length -1; i++){
            if(array[i] != -1){
                if(array[i] != array[i+1]){
                    result = new int[]{};
                    array[i] = result[count];
                    count++;
                }
            }
        }
        return result;
    }

}
