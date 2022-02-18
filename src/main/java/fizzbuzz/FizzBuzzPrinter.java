package fizzbuzz;

public class FizzBuzzPrinter {
    private Printer printer;

    public FizzBuzzPrinter(Printer printer) {
        this.printer = printer;
    }

    public void print(int start, int end) {
        for(int i = start; i <= end; i++) {
            printer.print(Integer.toString(i));
        }
    }
}
