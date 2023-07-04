package Chapter3.CreditLimitCalculator;

import java.util.Scanner;

public class CreditLimitCalculatorMain {
    public static void main(String[] args) {
        CreditLimitCalculator creditLimitCal = new CreditLimitCalculator();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the following Information:");
        System.out.println();

        System.out.println("Account Number: ");
        String accountNumber = input.nextLine();
        creditLimitCal.setAccountNumber(accountNumber);

        System.out.println("Customers Balance at the beginning of the month: ");
        int balance = input.nextInt();
        creditLimitCal.setBalance(balance);

        System.out.println("Total of all items charged by the customer: ");
        int totalItems = input.nextInt();
        creditLimitCal.setTotalItems(totalItems);

        System.out.println("Total of all credits applied to the customer’s account: ");
        int totalCredit = input.nextInt();
        creditLimitCal.setTotalCredit(totalCredit);

        System.out.println("Credit Limit: ");
        int creditLimit = input.nextInt();
        creditLimitCal.setCreditLimit(creditLimit);


        creditLimitCal.newBalance(balance, totalItems, totalCredit);

//        System.out.println(creditLimitCal.newBalance(balance,totalItems, totalCredit));

    }
}
