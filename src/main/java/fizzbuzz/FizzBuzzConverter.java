package fizzbuzz;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzConverter {
    private static List<FizzBuzzEntry> DEFAULT_ENTRIES = Arrays.asList(new FizzBuzzEntry(15, "FizzBuzz"),
            new FizzBuzzEntry(3, "Fizz"),
            new FizzBuzzEntry(5, "Buzz"));

    private List<FizzBuzzEntry> entries;

    public static FizzBuzzConverter INSTANCE = new FizzBuzzConverter();

    public FizzBuzzConverter(List<FizzBuzzEntry> entries) {
        this.entries = entries;
    }

    public FizzBuzzConverter() {
        this(DEFAULT_ENTRIES);
    }

    public String getLine(int i) {
        for (FizzBuzzEntry entry : entries) {
            var isDivisible = MathUtilities.isDivisibleBy(i, entry.getMod());
            if(isDivisible) {
                return entry.getLine();
            }
        }

        return Integer.toString(i);
    }
}
