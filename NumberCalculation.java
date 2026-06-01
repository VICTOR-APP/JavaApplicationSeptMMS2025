import java.util.Scanner;

public class NumberCalculation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        // Collect 10 numbers
        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Sum of 1st, 5th, and 10th numbers
        int sum1 = numbers[0] + numbers[4] + numbers[9];

        // Sum of 3rd, 8th, and 2nd numbers
        int sum2 = numbers[2] + numbers[7] + numbers[1];

        // Multiply the two sums
        int multiplication = sum1 * sum2;

        // Sum of 4th, 7th, 6th, and 9th numbers
        int sum3 = numbers[3] + numbers[6] + numbers[5] + numbers[8];

        // Subtract the multiplication result from sum3
        int finalResult = sum3 - multiplication;

        // Display final result
        System.out.println("Final Result = " + finalResult);

        // Check condition
        if (finalResult >= 100) {
            System.out.println("hurray I did it");
        } else {
            System.out.println("I still need to learn more in Java");
        }

        input.close();
    }
}