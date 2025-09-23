package Chapter3.Account;

import java.util.Objects;
import java.util.Scanner;

public class AccountClassTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 3;

        AccountClass account_1 = new AccountClass("Smile", 23.4);
        displayAccount(account_1);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.printf("Your account details are: %nName: %s%nBalance Amount: %.2f%n", account_1.getName(), account_1.getBalance());

        System.out.println("Would you like to make a deposit? ");
        System.out.println("Enter 'Y' for yes and 'N' for no");
        String letter = input.next();

        if (letter.equals("y") || letter.equals("Y")){
            System.out.println("Enter deposit amount: ");
            int amount = input.nextInt();

            account_1.deposit(amount);

            System.out.printf("Your account details are: %nName: %s%nBalance Amount: %.2f", account_1.getName(), account_1.getBalance());
        } else if (letter.equals("n") || letter.equals("N")) {
            System.out.println("Thank you for banking with us");
            input.close();
        }else {
            count--;
            System.out.println("Enter 'Y' for yes and 'N' for no");
        }

    }


    public static  void displayAccount(AccountClass accountClass ){


        System.out.println(accountClass.getName() + "\nYour balance is " + accountClass.getBalance());
        

    }




}
