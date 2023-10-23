package Chapter5;

public class Interest {
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 5.0/100.0;


//             
//        while (rate <= 0.1){
//            System.out.printf("%s%20s%n", "Year", "Amount on deposit");
//            for (int year = 1; year <= 10; ++year) {
//
//                double amount = principal * Math.pow(1.0 + rate, year);
//                System.out.printf("%4d%, 20.2f%n", year, amount);
//                rate++;
//            }
//        }

        while (rate <= 10.0 / 100.0) {

            for (int i = 0; i <= 10; i++) {
                System.out.printf("%f%n%s%20s%n", rate,"Year", "Amount on deposit");
            for (int year = 1; year <= 10 ; year++) {
                double amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%4d%, 20.2f%n", year, amount);
                }
                System.out.println();
                rate++;
            }

        }

    }
}
