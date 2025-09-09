package Chapter2Exercise;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pie =  Math.PI;
        System.out.println("Enter the radius of your circle: ");
        int radius = input.nextInt();

        int diameter = 2 * radius;
        double circumference = 2 * (pie *radius);
        double area =  Math.pow(pie * radius, 2 );


        System.out.printf("The diameter of your circle is %d%n", diameter);
        System.out.printf("The circumference of your circle is %f%n", circumference);
        System.out.printf("The area of your circle is %f%n", area);


    }
}
