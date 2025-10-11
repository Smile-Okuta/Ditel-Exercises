package Chapter4;

import java.util.Scanner;

public class SalesCommission {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 1;
        double total = 0;
        String itemName;

        System.out.println("**************************************************");
        System.out.println("**************************************************\n");
        System.out.println("ODOGWU'S SALES COMMISSION CALCULATOR\n");
        System.out.println("**************************************************");
        System.out.println("**************************************************\n");

        System.out.print("Enter Sales person name:  \n\n");
        String personName = input.nextLine();

        while(true){

            System.out.print("Item " + count + "\nEnter item name or # to cancel:  ");
            itemName = input.nextLine();
            if (itemName.equalsIgnoreCase("#")){
                input.close();

                System.out.println("Would you like to calculate another sales Person Item? 'Y' yes - 'N' No");
                String alph = input.nextLine();
                if (alph.equalsIgnoreCase( "n")){
                    break;
                } else if (alph.equalsIgnoreCase("y")) {
                    continue;
                }
            }
                System.out.print("Enter amount:   ");
                double itemAmount = input.nextDouble();

                SalesCommission salesCommission = new SalesCommission(itemName, itemAmount);

                total += salesCommission.getItemAmount();


            System.out.printf("item               Value%n%-10d%.2f", count, itemAmount);



        }



    }



    private String itemName;
    private double itemAmount;


    public SalesCommission(String itemName, double itemAmount) {
        this.itemName = itemName;
        this.itemAmount = itemAmount;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(double itemAmount) {
        this.itemAmount = itemAmount;
    }


    public double salesEarning(double totalItemAmount){
        double weekPay = 200.00;

        double weekBonus = (totalItemAmount * 9) / 100;

        return weekPay + weekBonus;
    }





}
