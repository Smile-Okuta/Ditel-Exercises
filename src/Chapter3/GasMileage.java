package Chapter3;

import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args) {
        GasMileage gasMileage = new GasMileage();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles driven: ");
        int miles = input.nextInt();
        gasMileage.setMiles(miles);
        System.out.println("Enter gallons used: ");
        int gallon = input.nextInt();
        gasMileage.setGallon(gallon);

        System.out.printf("Your Miles Per Gallon is : %.2f", gasMileage.divide(miles, gallon));


    }


    private int miles;
    private int gallon;

    public GasMileage(int miles, int gallon) {
        this.miles = miles;
        this.gallon = gallon;
    }

    public GasMileage(){}

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public int getGallon() {
        return gallon;
    }

    public void setGallon(int gallon) {
        this.gallon = gallon;
    }

        double divide(int miles, int gallon) {
        this.miles = miles;
        this.gallon = gallon;
        return (double) miles / gallon;
    }
}
