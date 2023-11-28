package Chapter6;

import java.util.Scanner;

public class SquareOfCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();
        System.out.println("Enter your Char: ");
        char fill = fillCharacter(num, input.next().charAt(0));


        fillCharacter(num, fill);
    }

    private static char fillCharacter(int num, char hash){
        for (int i = 0; i < num ; i++) {
            for (int j = 0; j < num ; j++) {
                System.out.print(hash+" ");
            }
            System.out.println(" ");
        }
        return hash;
    }
}
