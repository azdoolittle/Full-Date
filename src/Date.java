/*
Pseudocode:
import scanner
declare class
declare main method
declare variables for month integer and month string
declare variables for number of days, day, year
write switch cases for each month and set days to that month
include checks if inputs are valid number ranges
concat all values and print the date
*/

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int monthInt;
        String monthStr;
        int monthNumOfDays;
        int dayInt;
        int yearInt;

        System.out.println("Enter month (mm): ");
            monthInt = input.nextInt();
            switch (monthInt) {
                case 1:
                    monthStr = "January";
                    monthNumOfDays = 31;
                    break;
                case 2:
                    monthStr = "February";
                    monthNumOfDays = 28;
                    break;
                case 3:
                    monthStr = "March";
                    monthNumOfDays = 31;
                    break;
                case 4:
                    monthStr = "April";
                    monthNumOfDays = 30;
                    break;
                case 5:
                    monthStr = "May";
                    monthNumOfDays = 31;
                    break;
                case 6:
                    monthStr = "June";
                    monthNumOfDays = 30;
                    break;
                case 7:
                    monthStr = "July";
                    monthNumOfDays = 31;
                    break;
                case 8:
                    monthStr = "August";
                    monthNumOfDays = 31;
                    break;
                case 9:
                    monthStr = "September";
                    monthNumOfDays = 30;
                    break;
                case 10:
                    monthStr = "October";
                    monthNumOfDays = 31;
                    break;
                case 11:
                    monthStr = "November";
                    monthNumOfDays = 30;
                    break;
                default:
                    monthStr = "December";
                    monthNumOfDays = 31;
                    break;
            }
        System.out.println("Enter day (dd): ");
            dayInt = input.nextInt();
            if (dayInt < 1 || dayInt > monthNumOfDays) {
                System.out.println("Enter a day (dd) from 1 to " + monthNumOfDays + ": ");
                dayInt = input.nextInt();
            }

        System.out.println("Enter year (yy): ");
            yearInt = input.nextInt();
            if (yearInt < 0 || yearInt > 99) {
                System.out.println("Enter a year (yy) from 00 - 99: ");
                yearInt = input.nextInt();
            }
        System.out.println("It is " + monthStr + " " + dayInt + ", 20" + yearInt + ".");

    }
}
