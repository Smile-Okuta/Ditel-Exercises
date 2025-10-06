package Chapter3;

import java.time.LocalDate;

public class HealthRecords {
    private String firstName;
    private String lastName;
    private String gender;
    private int birthMonth;
    private int birthDay;
    private int birthYear;
    private double heightInInches;
    private double weightInPounds;

    public HealthRecords(String firstName, String lastName, String gender,
                         int birthMonth, int birthDay, int birthYear,
                         double heightInInches, double weightInPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getGender() { return gender; }
    public int getBirthMonth() { return birthMonth; }
    public int getBirthDay() { return birthDay; }
    public int getBirthYear() { return birthYear; }
    public double getHeightInInches() { return heightInInches; }
    public double getWeightInPounds() { return weightInPounds; }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setGender(String gender) { this.gender = gender; }
    public void setBirthMonth(int birthMonth) { this.birthMonth = birthMonth; }
    public void setBirthDay(int birthDay) { this.birthDay = birthDay; }
    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }
    public void setHeightInInches(double heightInInches) { this.heightInInches = heightInInches; }
    public void setWeightInPounds(double weightInPounds) { this.weightInPounds = weightInPounds; }




    public int getUserAge(){
        LocalDate year = LocalDate.now();

        return year.getYear() - birthYear;
    }


    public int getMaxHeartRate(){
        return 220 - getUserAge();
    }





}
