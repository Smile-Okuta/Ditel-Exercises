package Chapter3.CreditLimitCalculator;

public class CreditLimitCalculator {
    private String accountNumber;
    private int balance;
    private int totalItems;
    private int totalCredit;
    private int creditLimit;

    public CreditLimitCalculator(String accountNumber, int balance, int totalItems, int totalCredit, int creditLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.totalItems = totalItems;
        this.totalCredit = totalCredit;
        this.creditLimit = creditLimit;
    }

    public CreditLimitCalculator() {
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
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

    public int newBalance(int balance, int totalItems, int totalCredit) {
        this.balance = balance;
        this.totalItems = totalItems;
        this.totalCredit = totalCredit;

        int add = balance + totalItems - totalCredit;
        if (add > creditLimit) {
            System.out.println("Credit Limit Exceeded !!!   ");
        }else if (add < creditLimit) {
           int limit = creditLimit - add;
            System.out.printf("You have more credit : %d", limit);
        }
        return add;
    }

//    public String message() {
//        this.newBalance( balance, totalItems, totalCredit) = newBalance;
//        if (newBalance(balance, totalItems, creditLimit) > creditLimit) {
//            System.out.println("Credit Limit Exceeded !!!");
//        } else if (newBalance(balance, totalItems, creditLimit) < creditLimit){
//            creditLimit - newBalance();
//        }


    }

