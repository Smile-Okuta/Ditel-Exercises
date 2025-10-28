package Chapter4;

import java.util.Scanner;

public class EnforcingPrivacy_Decryption {

/*
This Encryption exercise was taken from Paul Deitel Java programming book, Chapter 4, exercise 4.39

The Encryption logic was done by adding the given number to 10, then subtracting the total from 7
This will in turn give you the original number but if the Encryption of the original number lead to a decimal
you would be getting a decimal in the form of a whole number as an encryption. So to counter this logic error I decided to divide
the result by 10 and get the remainder to get whole a number.
I hope this logic solutions helps someone .
...X O X O...
 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Encryption number: ");

        while (true) {

            int num = input.nextInt();



                int fourth = num % 10;
                int third = (num % 100) / 10;
                int second = (num % 1000) / 100;
                int first = num / 1000;

            if (num > 9999 || num <= 999 && first != 0) {
                System.out.println("Not an Encryption number \n");
            } else {

                int totalFourth = ((fourth + 10) - 7) % 10;
                int totalThird = ((third + 10) - 7) % 10;
                int totalSecond = ((second + 10) - 7) % 10;
                int totalFirst = ((first + 10) - 7) % 10;

                System.out.printf("%n%d%d%d%d", totalThird, totalFourth, totalFirst, totalSecond);

                break;


            }


        }
    }
}
