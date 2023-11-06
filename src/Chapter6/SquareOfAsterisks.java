package Chapter6;

import java.util.Scanner;;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int value = squareOfAsterisks(input.nextInt());
    }
    public static int squareOfAsterisks(int num){
        for (int i = 0; i < num ; i++) {
            for (int j = 0; j < num ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        return num;
    }
}
