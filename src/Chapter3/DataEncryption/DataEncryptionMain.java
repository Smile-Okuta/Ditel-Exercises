package Chapter3.DataEncryption;

import Chapter3.DataEncryption.DataEncryption;

import java.util.Scanner;
public class DataEncryptionMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;

        DataEncryption encryption = new DataEncryption(num);

        System.out.println("Enter 4 numbers");
        num = input.nextInt();
        encryption.setNumbers(num);


        System.out.print(encryption.swapNum());


//        System.out.printf("your encrypted number is : %d", encryption.swapNum());

//        encryption.swapNum();
    }
}
