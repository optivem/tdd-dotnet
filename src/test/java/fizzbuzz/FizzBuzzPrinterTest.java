package fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzPrinterTest {

    @Test
    void canPrintFizzBuzz1To1() {
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
    void canPrintFizzBuzz1To2() {
        // Arrange
        int start = 1;
        int end = 2;
        List<String> expectedLines = Arrays.asList("1", "2");
        FakePrinter printer = new FakePrinter();
        FizzBuzzPrinter fizzBuzzPrinter = new FizzBuzzPrinter(printer);

        // Act
        fizzBuzzPrinter.print(start, end);

        // Assert
        List<String> lines = printer.getLines();
        Assertions.assertLinesMatch(expectedLines, lines);
    }

    @Test
    void canPrintFizzBuzz1To3() {
        // Arrange
        int start = 1;
        int end = 3;
        List<String> expectedLines = Arrays.asList("1", "2", "Fizz");
        FakePrinter printer = new FakePrinter();
        FizzBuzzPrinter fizzBuzzPrinter = new FizzBuzzPrinter(printer);

        // Act
        fizzBuzzPrinter.print(start, end);

        // Assert
        List<String> lines = printer.getLines();
        Assertions.assertLinesMatch(expectedLines, lines);
    }

    @Test
    void canPrintFizzBuzz1To5() {
        // Arrange
        int start = 1;
        int end = 5;
        List<String> expectedLines = Arrays.asList("1", "2", "Fizz", "4", "Buzz");
        FakePrinter printer = new FakePrinter();
        FizzBuzzPrinter fizzBuzzPrinter = new FizzBuzzPrinter(printer);

        // Act
        fizzBuzzPrinter.print(start, end);

        // Assert
        List<String> lines = printer.getLines();
        Assertions.assertLinesMatch(expectedLines, lines);
    }

    @Test
    void canPrintFizzBuzz1To12() {
        // Arrange
        int start = 1;
        int end = 12;
        List<String> expectedLines = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz");
        FakePrinter printer = new FakePrinter();
        FizzBuzzPrinter fizzBuzzPrinter = new FizzBuzzPrinter(printer);

        // Act
        fizzBuzzPrinter.print(start, end);

        // Assert
        List<String> lines = printer.getLines();
        Assertions.assertLinesMatch(expectedLines, lines);
    }
}