import java.io.Console;

public class Main {

    public static void main(String[] args) {
        Console console = System.console();

        // TODO: 1. Create an array of good cow names (this should be a String array).
        String[] cowNames = {"Mike","Will","Bernie"};

        // TODO: 2. Create an array of Cows the same length as your 'names' array.
        Cow[] cows = new Cow[cowNames.length];

        // TODO: 3. Use a for loop to populate the 'cows' array with Cows using names from the 'names' array.
        for (int i = 0; i < cows.length; i++) {
            cows[i] = new Cow(cowNames[i]);
        }

        // TODO: 4. Use an enhanced for loop to print the name of each Cow.
        for (Cow cow : cows) {
            System.out.printf("Hello, my name is %s%n",
                              cow.getName());

        }

    }
}