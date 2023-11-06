package Chapter6;

import java.util.Scanner;

public class GabrielExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int userInput = input.nextInt();



        for (int i = 1; i <= userInput; i++) {
            if (userInput / i == i) {
                System.out.println(userInput + " Is a square number");
                break;
            }if(i == userInput ) System.out.println("This is not a square number");

        }


    }
}



//        if(i <= userInput) {
//            int squareRoot = userInput / i;
//            userInput == i * squareRoot {
//                System.out.println(userInput +" Is a square number");
//            }
//            else System.out.println("This is not  a square number");
//            i++;

