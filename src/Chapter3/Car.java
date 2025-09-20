package Chapter3;

public class Car {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "2012", 3456.24);
        Car car2 = new Car("Lexus", "2020", 89476.45);

        System.out.printf("Your car: %s %s%nOriginal price: %.3f%n", car1.model, car1.year, car1.price);

        double discount_Car1 = car1.price * ((double) 5 /100);

        System.out.printf("Discounted price is: %.3f%n", discount_Car1);

    }


    private String model;
    private String year;
    private double price;


    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }else {
            System.out.println("price not positive");
        }
    }








}
