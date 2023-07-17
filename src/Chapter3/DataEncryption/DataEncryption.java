package Chapter3.DataEncryption;

import java.util.Scanner;

public class DataEncryption {
    private  int numbers;


    public DataEncryption(int numbers) {

                this.numbers = numbers;

    }


    public void setNumbers(int numbers) {
            this.numbers = numbers;

    }
    public int getNumbers() {
        return numbers;
    }

//    public int encryptNum(){
//
//            int encrypt = numbers + 7;
//            int total = encrypt % 10;
//
//        return total;
//    }

    public int swapNum(){

        int fourthNum = numbers % 10;
        int thirdNum =  (numbers / 10) % 10;
        int secondNum =  (numbers / 100) % 10;
        int firstNum = (numbers / 1000) % 10;

        int num4 = (fourthNum + 7) % 10;
        int num3 = (thirdNum + 7) % 10;
        int num2 = (secondNum + 7) % 10;
        int num1 = (firstNum + 7) % 10;

        return num3 * 1000 + num4 * 100 + num1 * 10 + num2;
    }


}
