package Chapter4;

public class WorldPopulationGrowth {
    private int year;
    private double growthRatePercentage;
    private int population;

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGrowthRatePercentage() {
        return growthRatePercentage;
    }

    public void setGrowthRatePercentage(double growthRatePercentage) {
        this.growthRatePercentage = growthRatePercentage;
    }

    public int worldPopulation(){
        int diffPopulation = (int)(growthRatePercentage * population) / 100;

        return diffPopulation + population;
    }
}
