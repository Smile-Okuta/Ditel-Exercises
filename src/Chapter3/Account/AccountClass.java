package Chapter3.Account;

public class AccountClass {

    private String name;
    private double balance;







    public void setBalance(double balance){
        if (balance > 0.0) {
            this.balance = balance;
        }
    }


    public double getBalance(){
        return balance;
    }


    public void deposit(double depositAmount){
        balance = balance + depositAmount;
    }

    public void withdraw(double debitAmount){
        if (debitAmount < balance) {
            balance = balance - debitAmount;
        }else {
            System.out.print("Withdrawal amount exceeds balance");
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
