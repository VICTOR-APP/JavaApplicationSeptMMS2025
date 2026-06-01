import java.util.Scanner;

public class EvenOrOddChecker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number;
        char option;

        do {
            System.out.print("Enter a number: ");
            number = scan.nextInt();

            if(number % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }

            System.out.print("Do you want to continue? (Y/N): ");
            option = scan.next().charAt(0);

        } while(option == 'Y' || option == 'y');

    }
}