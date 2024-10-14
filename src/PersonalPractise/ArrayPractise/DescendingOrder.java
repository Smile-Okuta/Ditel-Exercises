package PersonalPractise.ArrayPractise;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {

        int[] array = {5, 9, 23, 2, 56};


        System.out.println(sortArray(array));
    }

    public static int sortArray(int[] array){
        int total =0;
        for (int i = 0; i < array.length; i++) {
            for (int num : array) {
                total += num;

            }
        }
        return total;
    }
}
