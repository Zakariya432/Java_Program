import java.util.Scanner;
import java.util.Arrays;

public class Arrayss{
    public static void main(String args[]){
        int n;
        System.out.println("Enter the size of the array:");
        Scanner s = new Scanner(System.in);
        n=s.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the Elemnts of the array:");
        Scanner z=new Scanner(System.in);
        for(int i=0;i<n;i++){
            a[i]=z.nextInt();
        }

        double sum =Arrays.stream(a).sum();

        double avg = sum/n;
        
        System.out.println("The Avg is:"+avg);
    }
}