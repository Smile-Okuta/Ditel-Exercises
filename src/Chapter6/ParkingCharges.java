package Chapter6;

public class ParkingCharges {
    private double minimumFee = 2.00;
    private static final double additionalCharges = 0.50;
    private int hour;

    public ParkingCharges() {
    }

    public double getMinimumFee() {
        return calculateCharges(hour);
    }

    public double calculateCharges(int hour) {
//        this.hour = hour;
        if ( hour > 3) {
            minimumFee = ((double) (hour - 3) * additionalCharges);
            if (hour >= 24) {
                minimumFee = 10.00;
            }
        }
        return minimumFee;
    }

    public int getHour() {
        return hour;
    }

    public int setHour(int hour) {
        this.hour = hour;
        return hour;
    }
    //
//    public double calculateCharges(){
//        if (time > 3 && time < 24){
//            double extraCharge = (time - 3) * additionalCharges;
//           if (time >= 24){
//               System.out.printf("Your charge is %f%n", maximumCharge);
//            }
//        }
//        return maximumCharge;
//    }




//    public double calculateCharges(int hour){
//        while (hour > 3) {
//            minimumFee = ((double) (hour - 3) * additionalCharges);
//            if (hour >= 24) {
//                minimumFee = 10.00;
//            }
//        }
//        return minimumFee;
//    }


}
