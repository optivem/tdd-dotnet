package fizzbuzz;

public class FizzBuzzPrinter {
    private static int FIZZ_MOD = 3;
    private static int BUZZ_MOD = 5;

    private static String FIZZ_LINE = "Fizz";
    private static String BUZZ_LINE = "Buzz";
    private static String FIZZBUZZ_LINE = "FizzBuzz";

    private Printer printer;

    public FizzBuzzPrinter(Printer printer) {
        this.printer = printer;
    }

    public void print(int start, int end) {
        for(int i = start; i <= end; i++) {
            String line = getLine(i);
            printer.print(line);
        }
    }

    private String getLine(int i) {
        var isFizz = isDivisibleBy(i, FIZZ_MOD);
        var isBuzz = isDivisibleBy(i, BUZZ_MOD);

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

    private boolean isDivisibleBy(int i, int mod) {
        return i % mod == 0;
    }
}
