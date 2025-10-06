package Chapter4;

import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalMile = 0;
        double totalGallon = 0;
        int count = 0;

        while (true){


            System.out.println("Enter your Miles driven or '0' to end: ");
            int miles = input.nextInt();

            if (miles == 0 ){
                break;

            }
            System.out.println("Enter your gallon used: ");
            int gallon = input.nextInt() ;

            if (gallon == 0){
                System.out.println("Gallons cannot be zero. trip skipped");
                continue;
            }

            GasMileage gasMileage = new GasMileage(gallon, miles);

            double trip = gasMileage.milesPerGallon();
            count++;


            totalMile += gasMileage.getMilesDriven();
            totalGallon += gasMileage.getGallonAmount();


            System.out.printf("Your miles per gallon for trip %d is: %.2f MPG%n", count, trip);



        }


             if (count == 0){
                 System.out.println("No trip was entered");
             }else {
                 System.out.printf("Total miles: %.2f Miles%nTotal Gallon: %.2f Gallons%n%n", totalMile, totalGallon);
                 System.out.printf("Your total miles per gallon for %d trips is %.2f", count, (totalMile / totalGallon ));
             }



    }








    private int milesDriven;
    private int gallonAmount;

    public GasMileage(int gallonAmount, int milesDriven) {
        this.gallonAmount = gallonAmount;
        this.milesDriven = milesDriven;
    }

    public int getMilesDriven() {
        return milesDriven;
    }


    public int getGallonAmount() {

        return gallonAmount;
    }


    public double milesPerGallon(){
        if (gallonAmount == 0){
            return 0.0;
        }
        return (double) milesDriven/ gallonAmount;
    }







}
