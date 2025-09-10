package JavaTutorial;

import java.util.Objects;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int count = 3;

        while (true){

            System.out.println("Enter your name: ");
            String name = input.nextLine();

            if (name.equals("David")) {

                System.out.println("Hello " + name);
                break;
            }else {
                count --;

                if(count >0){
                    System.out.println("Wrong name. Try again. (" + count + " attempts )");

                }else {
                    System.out.println("Time Up");
                   break;
                }
            }



        }




    }
}
