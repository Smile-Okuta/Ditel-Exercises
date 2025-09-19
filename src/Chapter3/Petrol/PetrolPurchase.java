package Chapter3.Petrol;

public class PetrolPurchase {
    private String stationLocation;
    private String petrolType;
    private int petrolQuantity;
    private double pricePerLiter;
    private double discount;



    public PetrolPurchase(String stationLocation, String petrolType, int petrolQuantity, double pricePerLiter, double discount) {
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.petrolQuantity = petrolQuantity;
        this.pricePerLiter = pricePerLiter;
        this.discount = discount;
    }



    public String getStationLocation() {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getPetrolQuantity() {
        return petrolQuantity;
    }

    public void setPetrolQuantity(int petrolQuantity) {
        this.petrolQuantity = petrolQuantity;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }



    public double getPurchaseAmount(){

        return (petrolQuantity * pricePerLiter) - discount;
    }








}
