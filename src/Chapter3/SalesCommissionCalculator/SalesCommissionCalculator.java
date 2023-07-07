package Chapter3.SalesCommissionCalculator;

public class SalesCommissionCalculator {
    private static int salary = 200;
    private int grossSales;
    private int sales;


    public SalesCommissionCalculator(int salary, int grossSales, int sales) {
        this.salary = salary;
        this.grossSales = grossSales;
        this.sales = sales;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }



    public double profit(double num) {
        return 9 * num / 100;
    }
}
