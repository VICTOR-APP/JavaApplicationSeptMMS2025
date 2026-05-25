import java.util.Scanner;

public class CreditLimitCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int balance, charges, credits, limit;

        System.out.print("Enter balance: ");
        balance = input.nextInt();

        System.out.print("Enter charges: ");
        charges = input.nextInt();

        System.out.print("Enter credits: ");
        credits = input.nextInt();

    6    System.out.print("Enter limit: ");
        limit = input.nextInt();

        int newBalance = balance + charges - credits;

        System.out.println("New balance = " + newBalance);

        if (newBalance > limit) {
            System.out.println("Limit exceeded");
        }
    }
}