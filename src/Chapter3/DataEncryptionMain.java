package Chapter3;

import java.util.Scanner;
public class DataEncryptionMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        int counter = 1;

        DataEncryption encryption = new DataEncryption(num);

        System.out.println("Enter 4 numbers");
        num = input.nextInt();
        encryption.setNumbers(num);

        while (counter <= 4) {

            counter++;
        }
        System.out.print(encryption.swapNum());

//        System.out.printf("your encrypted number is : %d", encryption.swapNum());

//        encryption.swapNum();
    }
}
