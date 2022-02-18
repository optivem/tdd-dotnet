package fizzbuzz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FakePrinter implements Printer {
    private List<String> lines;

    public FakePrinter() {
        this.lines = new ArrayList<>();
    }

    public List<String> getLines() {
        return Collections.unmodifiableList(lines);
    }

    @Override
    public void print(String line) {
        lines.add(line);
    }
}
