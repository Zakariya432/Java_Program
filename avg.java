//import java.util.Scanner;

public class avg {
    public static void  main(String args[])
    {

        int[] numbers = { 10, 20, 30, 40 };

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.length;

        System.out.println("The values of the Array :");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nAverage: " + average);
    }
}