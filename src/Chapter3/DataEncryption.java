package Chapter3;

import java.util.Scanner;

public class DataEncryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int net = 0;
        int digit = 0;

//        while(counter <= 4) {
//            System.out.println("Enter your four digit code: ");
//                digit = input.nextInt();
//
//            if (digit > -1 && digit <= 9){
//                int total = digit + 7;
//                net = total % 10;
//            }
//            else {
//                System.out.println("Enter number between 1 - 9");
//
//            }
//            System.out.println(net);
//            counter++;



        do{
            int total = digit + 7;
            net = total % 10;
            ++counter;
        }while (counter <= 4);


            }
    }
