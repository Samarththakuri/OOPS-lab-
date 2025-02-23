package Experiment3;
import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("The number of elements must be greater than zero.");
            return;
        }

        int[] m = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of element " + (i + 1) + ": ");
            int value = sc.nextInt();

            if (value < 0) {
                System.out.println("Negative value not allow.");
                return;
            }
            m[i] = value;
        }

        System.out.print("The array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println();

        int min = m[0];
        int max = m[0];

        for (int i = 1; i < n; i++) {
            if (m[i] < min) {
                min = m[i];
            }
            if (m[i] > max) {
                max = m[i];
            }
        }
        System.out.print("The min and max elements are : ");

        System.out.println( min+" "+max);
        
        sc.close();
}
}
