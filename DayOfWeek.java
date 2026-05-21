import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number from 1 to 7: ");
        int day = input.nextInt();

        switch(day) {
            case 1:
                System.out.println("The Day you entered is Monday");
                break;
            case 2:
                System.out.println("The Day you entered is Tuesday");
                break;
            case 3:
                System.out.println("The Day you entered is Wednesday");
                break;
            case 4:
                System.out.println("The Day you entered is Thursday");
                break;
            case 5:
                System.out.println("The Day you entered Friday");
                break;
            case 6:
                System.out.println("The Day you entered  Saturday");
                break;
            case 7:
                System.out.println("The Day you entered Sunday");
                break;
            default:
                System.out.println("Invalid input! Please enter a number from 1 to 7.");
        }

        input.close();
    }
}