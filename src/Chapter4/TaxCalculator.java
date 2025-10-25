package Chapter4;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double taxBill;
        double extraBill;
        double totalTax = 0;
//        String letter;

        while (true) {

            System.out.println("Enter citizen's name :  ");
            String name = input.nextLine();
            System.out.println("Enter citizen's annual earning : ");
            double earning = Double.parseDouble(input.nextLine());

            if (earning <= 30000) {
                taxBill = (earning * 15) / 100;
                totalTax = taxBill;

            } else if (earning > 30000) {
                double excess = earning - 30000;

                taxBill = (earning * 15) / 100;
                extraBill = (excess * 20) / 100;
                totalTax = taxBill + extraBill;

            }


            System.out.printf("Citizen's name :   %s%n", name);
            System.out.printf("Citizen's earning :   $%.2f%n", earning);
            System.out.printf("Citizen's total tax :   $%.2f%n%n%n", totalTax);


            System.out.print("Do you want to continue? (y/n):");
            String letter = input.nextLine();
            if (letter.equalsIgnoreCase("n")){
                System.out.println("\nGood Bye !!!");
                break;
            }

        }
        input.close();


    }
}
