import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double hours, rate, pay;

        System.out.print("Enter hours worked: ");
        hours = input.nextDouble();

        System.out.print("Enter hourly rate: ");
        rate = input.nextDouble();

        pay = hours * rate;

        System.out.println("Gross pay = $" + pay);
    }
}