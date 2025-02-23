package Experiment3;
import java.util.Scanner;

public class Majority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int majorityElement = findMajorityElement(nums);
        System.out.println("The majority element is: " + majorityElement);
        
        sc.close();
    }
    
    public static int findMajorityElement(int[] nums) {
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int count = 0;
            
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            
            if (count > n / 2) {
                return nums[i];
            }
        }
        
        return -1;
}
}