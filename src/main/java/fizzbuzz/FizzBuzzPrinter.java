package fizzbuzz;

public class FizzBuzzPrinter {
    private Printer printer;

    public FizzBuzzPrinter(Printer printer) {
        this.printer = printer;
    }

    public void print(int start, int end) {
        for(int i = start; i <= end; i++) {
            if(i % 3 == 0) {
                printer.print("Fizz");
            } else {
                var line = Integer.toString(i);
                printer.print(line);
            }
        }
    }
}
