package Experiment3;
import java.util.Scanner;
public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :");
        String line = sc.nextLine();
        System.out.println();
        String [] Words = line.split(" ");
        System.out.print("Reverse String is :");
        for (int i = Words.length -1;i >=0;i--){
            System.out.print(Words[i]+" ");    
        }
        sc.close();
}
}