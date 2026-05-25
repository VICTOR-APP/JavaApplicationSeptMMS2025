import java.util.Scanner;

public class ValidateInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int value;

        System.out.print("Enter 1 or 2: ");
        value = input.nextInt();

        while (value != 1 && value != 2) {
            System.out.print("Try again (1 or 2): ");
            value = input.nextInt();
        }

        System.out.println("Correct input");
    }
}