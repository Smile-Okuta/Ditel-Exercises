package Chapter5;

import java.util.Scanner;

public class TaxPlanMain {
    public static void main(String[] args) {
        TaxPlan taxPlan = new TaxPlan();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Housing expenses for the month: ");
        int housing = input.nextInt();

        System.out.println("Enter your Food expenses for the month: ");
        int food = input.nextInt();
        System.out.println("Enter your Clothing expenses for the month: ");
        int clothing = input.nextInt();
        System.out.println("Enter your Transportation expenses for the month: ");
        int transportation = input.nextInt();
        System.out.println("Enter your Education expenses for the month: ");
        int education = input.nextInt();
        System.out.println("Enter your HealthCare expenses for the month: ");
        int healthCare = input.nextInt();
        System.out.println("Enter your Vacation expenses for the month: ");
        int vacation = input.nextInt();


        int expenses = housing + food + clothing + transportation + education + healthCare + vacation;
        taxPlan.setCostExpenses(expenses);

//        int percentageExpenses = (23 * expenses) / 100;

        System.out.printf("Your Total Tax for all your expenses is %d", taxPlan.expenses());
    }
}