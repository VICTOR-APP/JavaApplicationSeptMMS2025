public class WorldPopulation {

    public static void main(String[] args) {

        double pop = 8_200_000_000.0;
        double rate = 0.008;

        System.out.println("Year\tPop\tIncrease");

        for (int y = 1; y <= 75; y++) {

            double inc = pop * rate;
            pop = pop + inc;

            System.out.println(y + "\t" + (long) pop + "\t" + (long) inc);
        }
    }
}