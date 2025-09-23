package Chapter3;

import java.time.LocalDate;
import java.util.Scanner;

public class HeartRate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter birth month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter birth day (1-31): ");
        int day = input.nextInt();

        System.out.print("Enter birth year (YYYY): ");
        int year = input.nextInt();



        HeartRate person = new HeartRate(firstName, lastName, month, day, year);


        System.out.println("\n--- Heart Rate Information ---");
        System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Date of Birth: " + person.getBirthMonth() + "/" + person.getBirthDay() + "/" + person.getBirthYear());
        System.out.println("Age: " + person.personAge() + " years");
        System.out.println("Maximum Heart Rate: " + person.maxHeartRate() + " bpm");
        System.out.println("Target Heart Rate Range: " + person.targetHeartRate());


    }








    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;


    public HeartRate(String firstName, String lastName, int birthDay, int birthMonth, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }


    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    private int personAge(){
        LocalDate year = LocalDate.now();
        int presentAge = year.getYear() - birthYear;

        System.out.printf("Your present age is: %d Years", presentAge);

        return presentAge;
    }

    private int maxHeartRate(){

        return 220 - personAge();

    }


    private String targetHeartRate(){

        int maxHR = maxHeartRate();
        int lower = (int)(maxHR * 0.50);
        int upper = (int)(maxHR * 0.85);
        return lower + " - " + upper + " bpm";

    }


    

}
