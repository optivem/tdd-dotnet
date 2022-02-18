package fizzbuzz;

public class FizzBuzzConverter {
    private static int FIZZ_MOD = 3;
    private static int BUZZ_MOD = 5;

    private static String FIZZ_LINE = "Fizz";
    private static String BUZZ_LINE = "Buzz";
    private static String FIZZBUZZ_LINE = "FizzBuzz";

    public static String getLine(int i) {
        var isFizz = MathUtilities.isDivisibleBy(i, FIZZ_MOD);
        var isBuzz = MathUtilities.isDivisibleBy(i, BUZZ_MOD);

        var isFizzBuzz = isFizz && isBuzz;
        if(isFizzBuzz) {
            return FIZZBUZZ_LINE;
        }

        if(isFizz) {
            return FIZZ_LINE;
        }

        if(isBuzz) {
            return BUZZ_LINE;
        }

        return Integer.toString(i);
    }
}
