package Chapter6;

import java.security.SecureRandom;

public class Craps {
    private static SecureRandom randomNumbers = new SecureRandom();
    public static int rollDice(){
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }
}
