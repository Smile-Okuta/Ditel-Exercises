package Chapter5;

import javax.swing.plaf.ScrollBarUI;
import java.util.Scanner;

public class GlobalWarmingFactsMain {
    public static void main(String[] args) {
         int result = 0;
         Scanner input = new Scanner(System.in);

        System.out.println("Question 1");
        System.out.println("What is the primary greenhouse gas responsible for global warming?");
        System.out.println("1)  Oxygen (O2)");
        System.out.println("2)  Methane (CH4)");
        System.out.println("3)  Nitrogen (N2)");
        System.out.println("4)  Carbon dioxide (CO2)");


        System.out.println("Enter your option in range 1 - 4");
        int userInput1 = input.nextInt();

        switch (userInput1){
            case 4:
                System.out.println("\ncorrect");
                result += 1;
                break;
            default:
                System.out.println("Wrong");
                break;
        }


        System.out.println("Question 2");
        System.out.println("Which human activity is the largest contributor to the increase in carbon dioxide emissions?");
        System.out.println("1)  Deforestation");
        System.out.println("2)  Industrial processes");
        System.out.println("3)  Transportation");
        System.out.println("4)  Agriculture");


        System.out.println("Enter your option in range 1 - 4");
        int userInput2 = input.nextInt();

        switch (userInput2){
            case 3:
                System.out.println("\ncorrect");
                result += 1;
                break;
            default:
                System.out.println("Wrong");
                break;
        }



        System.out.println("Question 3");
        System.out.println("What is the term used to describe the gradual rise in Earth's average temperature due to increased greenhouse gas concentrations?");
        System.out.println("1)  Climate swing");
        System.out.println("2)  Temperature flux");
        System.out.println("3)  Global warming");
        System.out.println("4)  Atmospheric shift");


        System.out.println("Enter your option in range 1 - 4");
        int userInput3 = input.nextInt();

        switch (userInput3){
            case 3:
                System.out.println("\ncorrect");
                result += 1;
                break;
            default:
                System.out.println("Wrong");
                break;
        }


        System.out.println("Question 4");
        System.out.println("Which of the following is an impact of global warming on the environment?");
        System.out.println("1)  Decreased frequency of hurricanes");
        System.out.println("2)  Expansion of polar ice caps");
        System.out.println("3)  Rising sea levels");
        System.out.println("4)  Increased biodiversity");


        System.out.println("Enter your option in range 1 - 4");
        int userInput4 = input.nextInt();

        switch (userInput4){
            case 3:
                System.out.println("\ncorrect");
                result += 1;
                break;
            default:
                System.out.println("Wrong");
                break;
        }

        System.out.println("Question 5");
        System.out.println("What are some potential consequences of continued global warming?");
        System.out.println("1)  Decreased frequency of droughts");
        System.out.println("2)  Reduced risk of wildfires");
        System.out.println("3)  Increased ocean pH levels");
        System.out.println("4)  More intense heatwaves");


        System.out.println("Enter your option in range 1 - 4");
        int userInput5 = input.nextInt();

        switch (userInput5){
            case 4:
                System.out.println("\ncorrect");
                result += 1;
                break;
            default:
                System.out.println("Wrong");
                break;
        }

        System.out.printf("Your score is %d", result);
        System.out.println();
        if (result == 5){
            System.out.println("Excellent");
        } else if (result == 4) {
            System.out.println("Very Good");
        } else if (result <= 3) {
            System.out.println("Time to brush up on your knowledge of global warming");
        }

    }
}


