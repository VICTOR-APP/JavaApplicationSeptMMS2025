import java.util.Scanner;

public class Encrypt {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 4-digit number: ");
        int n = input.nextInt();

        int d1 = (n / 1000 + 7) % 10;
        int d2 = (n / 100 % 10 + 7) % 10;
        int d3 = (n / 10 % 10 + 7) % 10;
        int d4 = (n % 10 + 7) % 10;

        System.out.println("Encrypted: " + d3 + d4 + d1 + d2);
    }
}