package JavaTutorial;

import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        if (age < 0){
            System.out.println("Invalid age");
        }
        if(age <= 7 ){
            System.out.println("Child ticket : 10$");
        }
        if(age >=8 && age <= 17){
            System.out.println("Teenager ticket: 15$");
        }

        if( age >= 18){
            System.out.println("Enter your salary: ");
            int salary = input.nextInt();


            if (salary < 0 ){
                System.out.println("Invalid Salary");
            }
            if (salary <= 1000){
                System.out.println("Reduced adult ticket 1: 20$");
            }
            if (salary >= 1001  && salary <= 2000){
                System.out.println("Reduced adult ticket 2: 25$");
            }else {
                System.out.println("Adult ticket: 30$");
            }






        }






    }
}
