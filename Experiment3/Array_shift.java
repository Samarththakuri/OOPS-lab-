package Experiment3;
import java.util.Scanner;

public class Array_shift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] num = new int[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the "+(i+1)+ " element:");
            num[i] = sc.nextInt();
        }

        int Index = 0; 

        for (int i = 0; i < n; i++) {
            if (num[i] != 0) {
                int temp = num[i];
                num[i] = num[Index];
                num[Index] = temp;

                Index++; 
            }
        }

        
        System.out.println("Array after shifting 0s to the end:");
        for (int value : num) {
            System.out.print(value + " ");
        }
        sc.close();
}
}