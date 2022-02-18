package fizzbuzz;

public class FizzBuzzPrinter {
    private static int FIZZ_MOD = 3;
    private static int BUZZ_MOD = 5;

    private static String FIZZ_LINE = "Fizz";
    private static String BUZZ_LINE = "Buzz";

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
        if(isFizz) {
            return FIZZ_LINE;
        }

        var isBuzz = isDivisibleBy(i, BUZZ_MOD);
        if(isBuzz) {
            return BUZZ_LINE;
        }

        return Integer.toString(i);
    }

    private boolean isDivisibleBy(int i, int mod) {
        return i % mod == 0;
    }
}
