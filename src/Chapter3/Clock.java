package Chapter3;

import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Clock clock = new Clock(3, 12, 3);

        clock.displayTime();



    }




    private int hour;
    private int minute;
    private int second;


    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }



    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour > 23) {
            this.hour = hour;
            }
        }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute > 59) {
            this.minute = minute;

        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second > 59){
            this.second = second;
        }

    }

    public void displayTime(){

        System.out.printf("%02d:%02d:%02d",getHour(), getMinute(), getSecond());

    }




}



