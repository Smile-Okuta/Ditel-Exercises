package JavaTutorial;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter your name: ");
        String name = input.nextLine();


        int count = 1;

        while (!name.equalsIgnoreCase("David")){
            System.out.println("Incorrect, enter name again: ");


            if (name.equalsIgnoreCase("david") && count <= 3){

                System.out.println("Hello "+ name);

            }
            else if (count > 3) {

                System.out.println("Times up");
                break;
            }

            count++;


        }






    }
}
