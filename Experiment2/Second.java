import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");  // kitni units
        int units = scanner.nextInt();

        double billAmount = 0;                                    //total bill ke lie

        if (units <= 100) {
            billAmount = units * 5;
        } else if (units <= 200) {                                    //(units * 7) instead of ((units - 100) * 7) - 101–200 range ke lie.
            billAmount = (100 * 5) + ((units - 100) * 7);
        } else if (units <= 300) {
            billAmount = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        } else {
            billAmount = (100 * 5) + (100 * 7) + (100 * 10) + ((units - 300) * 15);
        }

        System.out.println("The total electricity bill is: Rs " + billAmount);
}
}