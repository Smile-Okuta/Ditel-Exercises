package Chapter4;

import java.util.Scanner;

public class CreditLimitCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.println("Enter Account Number or -1 to cancel: ");
            int accountNum = input.nextInt();

            if (accountNum == -1){
                break;
            }
            System.out.println("Enter Account balance: ");
            int accountBal = input.nextInt();
            System.out.println("Enter Total Charges: ");
            int totalCharges = input.nextInt();
            System.out.println("Enter Total Credit: ");
            int totalCredit = input.nextInt();
            System.out.println("Enter Credit Limit: ");
            int creditLimit = input.nextInt();


            CreditLimitCal creditLimitCal = new CreditLimitCal(accountNum, accountBal, totalCharges, totalCredit, creditLimit);

            int newBalance = creditLimitCal.newBalance();

            System.out.printf("New Balance : %d%n%n", newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit Limit Exceeded");
            } else {
                System.out.println("Customer has " + (creditLimit - newBalance) + " Credit Limit left");
            }

        }

    }



    private int accountNumber;
    private int accountBalance;
    private int totalCharges;
    private int totalCredit;
    private int creditLimit;

    public CreditLimitCal(int accountNumber, int accountBalance, int totalCharges, int totalCredit, int creditLimit) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.totalCharges = totalCharges;
        this.totalCredit = totalCredit;
        this.creditLimit = creditLimit;
    }



    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getTotalCharges() {
        return totalCharges;
    }

    public void setTotalCharges(int totalCharges) {
        this.totalCharges = totalCharges;
    }

    public int getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(int totalCredit) {
        this.totalCredit = totalCredit;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }



    public int newBalance(){
        return accountBalance + totalCharges - totalCredit;
    }







}
