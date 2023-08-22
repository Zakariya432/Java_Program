//Write a program in Java that takes input of a Name of month and gives the
//output of Number of days in that month

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        
        String[] months = {
            "January", "February", "March", "April","May", "June", "July", "August", 
            "September", "October", "November", "December"
        };
        
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        
        System.out.print("Enter the name of the month: ");
        String inputMonth = z.nextLine();
        
        int days = getDaysInMonth(inputMonth, months, daysInMonth);
        
        if (days!=-1) {
            System.out.println("Number of days in " + inputMonth + ": " + days);
        } else {
            System.out.println("Invalid month name entered.");
        }
        
    }
    
    public static int getDaysInMonth(String month, String[] monthNames, int[] daysArray) {
        for (int i = 0; i < monthNames.length; i++) {
            if (month.equalsIgnoreCase(monthNames[i])) {
                return daysArray[i];
            }
        }
        return -1; 
    }
}
