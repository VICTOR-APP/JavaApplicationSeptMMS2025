import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int miles = 0;
        int gallons = 0;

        System.out.print("Enter miles: ");
        miles = input.nextInt();

        System.out.print("Enter gallons: ");
        gallons = input.nextInt();

        double mpg = (double) miles / gallons;

        System.out.println("MPG = " + mpg);
    }
}