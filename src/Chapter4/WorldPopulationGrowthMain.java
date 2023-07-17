package Chapter4;

import java.util.Scanner;

public class WorldPopulationGrowthMain {
    public static void main(String[] args) {
        WorldPopulationGrowth populationGrowth = new WorldPopulationGrowth();

        Scanner input = new Scanner(System.in);
        int counter = 0;
        int finalTotal;

        System.out.println("Enter current year: ");
        int year = input.nextInt();
        populationGrowth.setYear(year);

        System.out.println("Enter current World Population: ");
        int currentPopulation = input.nextInt();
        populationGrowth.setPopulation(currentPopulation);

        System.out.println("Enter current Population Growth Rate: ");
        double growthRate = input.nextDouble();
        populationGrowth.setGrowthRatePercentage(growthRate);


        System.out.printf("%n%s%25s%n", "Year", "World Population");

        while (counter <= 75){

        if (populationGrowth.getYear() != 0 ){
            year += 1;
            System.out.printf("%4d%20d%n", year, populationGrowth.worldPopulation());

            populationGrowth.setPopulation(populationGrowth.worldPopulation());

        }
        else {
            System.out.println("No figure was entered");
        }

            ++counter;
        }

    }
}
