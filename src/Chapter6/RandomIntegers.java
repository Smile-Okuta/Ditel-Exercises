package Chapter6;

import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
//
//        for (int counter = 1; counter <= 20; counter++){
//            int face = 1 + randomNumbers.nextInt(6);
//
//            System.out.printf("%d ", face);
//
//            if (counter % 5 == 0){
//                System.out.println();
//            }
//        }
        for (int i = 0; i <= 6 ; i++) {
            int n = randomNumbers.nextInt(12);
            System.out.print(" "+n);
        }

    }
}
