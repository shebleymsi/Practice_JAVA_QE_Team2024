package learnJavaQEWinter2022.Problems;

import java.util.Scanner;

public class FindOutWeekDays {

    public FindOutWeekDays() {
    }

    public static void main(String[] args) {
        getWeekDays();
    }

    public static void getWeekDays() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your day serial of the week");
        int day = input.nextInt();
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "out of the day";
        }

        System.out.println("Day name " + dayName);
    }
}

