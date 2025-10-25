package Chapter4;

import java.util.Scanner;

public class SalesCommission {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 1;
        double total = 0;
        String itemName;
        double itemAmount;
        double earning = 0;

        System.out.println("**************************************************");
        System.out.println("**************************************************\n");
        System.out.println("ODOGWU'S SALES COMMISSION CALCULATOR\n");
        System.out.println("**************************************************");
        System.out.println("**************************************************\n");

        System.out.print("Enter Sales person name:  \n");
        String personName = input.nextLine();

        while(true){

            System.out.print("\nItem " + count + "\nEnter item name or # to cancel:  \n");
            itemName = input.nextLine();

                if (itemName.equalsIgnoreCase("#")){
                    break;
                }

            System.out.print("Enter amount:   ");
            itemAmount = input.nextDouble();
            count++;

            SalesCommission salesCommission = new SalesCommission(itemName, itemAmount);

            total += salesCommission.getItemAmount();
            earning = salesCommission.salesEarning(total);


        }

        System.out.println("Sales person: "+ personName);
        System.out.println("Total sales:  " + total);
        System.out.println("Net Pay:  " + earning);



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
