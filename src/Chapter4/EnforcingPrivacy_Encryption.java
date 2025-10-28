package Chapter4;

import java.util.Scanner;

public class EnforcingPrivacy_Encryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 4 digit");

        while (true){

            int num = input.nextInt();

            if (num > 9999 || num <= 999){
                System.out.println("Four digit is required \n");
            }else {

                int fourth = num % 10;
                int third = (num % 100) / 10;
                int second = (num % 1000) / 100;
                int first = num / 1000;

                int totalFourth = (fourth += 7) % 10 ;
                int totalThird = (third += 7 ) % 10;
                int totalSecond = (second += 7) % 10;
                int totalFirst = (first += 7) % 10;

//                System.out.printf("%n%d%d%d%d", totalThird, totalFourth, totalFirst, totalSecond);
                System.out.printf("%n%d%d%d%d", totalFirst, totalSecond, totalThird, totalFourth);
                break;


            }



        }




    }
}
