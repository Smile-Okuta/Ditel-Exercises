package Chapter5;

import java.util.Scanner;

public class Extremes {

        public int findMax() {
            Scanner input = new Scanner(System.in);
            int number = 1;
            int maximum = Integer.MIN_VALUE;
            int minimum = Integer.MAX_VALUE;

            System.out.println("How many values would you like to input?: ");
            int value = input.nextInt();

            for (int i = 1; i <= value; i++) {
                System.out.printf("input integer " + i + " : ", value);
                number = input.nextInt();

                if (number > maximum) {
                    maximum = number;
                }
                if (number < minimum){
                    minimum = number;
                }
            }



            int sumOfNum = maximum + minimum;
            System.out.printf("Your Maximum is %d and your minimum is %d%n ", maximum, minimum);
            System.out.println("Sum of your maximum and minimum is");

        return sumOfNum;
            
        }


        public static void main(String[] args) {

        Extremes max = new Extremes();
            System.out.println(max.findMax());


    }

}

