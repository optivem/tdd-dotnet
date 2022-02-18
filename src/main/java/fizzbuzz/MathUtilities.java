package fizzbuzz;

public class MathUtilities {
    private MathUtilities() { }

    public static boolean isDivisibleBy(int i, int mod) {
        return i % mod == 0;
    }
}
