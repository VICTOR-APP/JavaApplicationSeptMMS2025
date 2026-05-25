import java.util.Scanner;

public class SalesCommission {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int item;
        double total = 0;

        System.out.print("Enter item number: ");
        item = input.nextInt();

        if (item == 1)
            total = 239.99;

        if (item == 2)
            total = 129.75;

        if (item == 3)
            total = 99.95;

        if (item == 4)
            total = 350.89;

        double earnings = 200 + (0.09 * total);

        System.out.println("Earnings = $" + earnings);
    }
}