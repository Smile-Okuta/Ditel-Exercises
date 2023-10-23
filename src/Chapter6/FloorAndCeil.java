package Chapter6;

import java.util.Scanner;

public class FloorAndCeil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        double num = input.nextDouble();
        System.out.println(myFloor(num));

    }

    public static int myFloor(double num) {
       int i = (int) num * 10;

        return  i / 10;

    }

//    public public int myCeil(double num){
//        return ;
//    }
}
