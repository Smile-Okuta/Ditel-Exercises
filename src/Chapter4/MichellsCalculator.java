package Chapter4;

import java.util.Scanner;

public class MichellsCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double discount = 0;

        System.out.println("**********************************************");
        System.out.println("**********************************************");
        System.out.println("     WELCOME MICHELLE'S DISCOUNT STORE");
        System.out.println("**********************************************");
        System.out.println("**********************************************");


        System.out.println("Enter your Student name: ");
        String name = input.nextLine();

        System.out.println("Enter your Student Meal Bill: ");
        double bill = input.nextDouble();


        if(bill >= 5000){
             discount = (bill * 15) / 100;
        } else if (bill > 2000 || bill <= 4999) {
            discount = (bill * 10) / 100;
        } else {
            System.out.println("No discount is available for you !!!");
        }

        double discountedBill = bill - discount;

        System.out.println("               YOUR RECEIPT");
        System.out.println("*************************************************");
        System.out.println("*************************************************\n\n");

        System.out.println("Student Name: " + name);
        System.out.println("Meal Bill:  " + bill);
        System.out.println("Your discount is:   " + discount);
        System.out.println("Your discounted bill is:  " + discountedBill);







    }
}
