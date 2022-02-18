package fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzPrinterTest {

    @Test
    void canPrintNumbers1To1() {
        // Arrange
        int start = 1;
        int end = 1;
        List<String> expectedLines = Arrays.asList("1");
        FakePrinter printer = new FakePrinter();
        FizzBuzzPrinter fizzBuzzPrinter = new FizzBuzzPrinter(printer);

        // Act
        fizzBuzzPrinter.print(start, end);

        // Assert
        List<String> lines = printer.getLines();
        Assertions.assertLinesMatch(expectedLines, lines);
    }

    @Test
    void canPrintNumbers1To5() {
        // Arrange
        int start = 1;
        int end = 5;
        List<String> expectedLines = Arrays.asList("1", "2", "3", "4", "5");
        FakePrinter printer = new FakePrinter();
        FizzBuzzPrinter fizzBuzzPrinter = new FizzBuzzPrinter(printer);

        // Act
        fizzBuzzPrinter.print(start, end);

        // Assert
        List<String> lines = printer.getLines();
        Assertions.assertLinesMatch(expectedLines, lines);
    }

}