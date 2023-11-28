package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing {
    private enum TossCoin {HEADS, TAILS}


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 to Toss Coin\n" +
                "1. Toss Coin\n" +
                "2. End Game");
        int toss = input.nextInt();

        tossGame(toss);

    }

    public static void tossGame(int toss) {
        TossCoin tossCoin = null;
        SecureRandom random = new SecureRandom();

        int frequency1 = 0;
        int frequency2 = 0;

        int count = 1;
        while (count <= 10) {
            if (toss == 1) {
                int coin = 1 + random.nextInt(2);

                switch (coin) {
                    case 1 -> {
                        tossCoin = TossCoin.HEADS;
                        ++frequency1;
                    }
                    case 2 -> {
                        tossCoin = TossCoin.TAILS;
                        ++frequency2;
                    }
                }
            } else {
                System.out.println("No coin was tossed");
            }
                count++;
        }




            if (tossCoin == TossCoin.HEADS) {
                System.out.println("HEADS");
            } else {
                System.out.println("TAILS");
            }
//                System.out.println(tossCoin);
            System.out.println("Face\tFrequency");
            System.out.printf("1\t%d%n2\t%d\n", frequency1, frequency2);


    }
}


