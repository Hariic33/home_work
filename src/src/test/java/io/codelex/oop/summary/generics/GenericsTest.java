package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericsTest {
    private StorageHouse<Object> objectStorageHouse;

    @Test
    @DisplayName("Combiner: testCombineTwoItems()")
    public void testCombineTwoItems() {
        Integer integer = 10;
        BigDecimal bigDecimal = new BigDecimal("10.5");

        String expected = "First item: " + integer + "; Second item: " + bigDecimal;
        String actual = Combiner.combineTwoItems(integer, bigDecimal);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Printer: testPrintValues()")
    public void testPrintValues() {
        Printer<BigDecimal> bigDecimalPrinter = new Printer<>(new BigDecimal("2.5"));
        bigDecimalPrinter.print();
        assertEquals(new BigDecimal("2.5"), bigDecimalPrinter.getThingToPrint());

        Printer<Integer> integerPrinter = new Printer<>(23);
        integerPrinter.print();
        assertEquals(23, integerPrinter.getThingToPrint());

        Printer<Double> doublePrinter = new Printer<>(3.3);
        doublePrinter.print();
        assertEquals(3.3, doublePrinter.getThingToPrint());

        Printer<String> stringPrinter = new Printer<>("Sup?");
        stringPrinter.print();
        assertEquals("Sup?", stringPrinter.getThingToPrint());

        Printer<Character> charPrinter = new Printer<>('x');
        charPrinter.print();
        assertEquals('x', charPrinter.getThingToPrint());
    }

    @BeforeEach
    public void setup() {
        objectStorageHouse = new StorageHouse<>(1);
        objectStorageHouse.addMoreItems(2);
        objectStorageHouse.addMoreItems(3);
        objectStorageHouse.addMoreItems("Hello");
    }

    @Test
    @DisplayName("StorageHouse: testAddMoreItems()")
    public void testAddMoreItems() {
        List<Object> expectedItems = Arrays.asList(1, 2, 3, "Hello");
        List<Object> actualItems = objectStorageHouse.getItems();

        assertEquals(expectedItems, actualItems);
    }

    @Test
    @DisplayName("StorageHouse: testGetMaybeFirstItem()")
    public void testGetMaybeFirstItem() {
        Optional<Object> firstItem = objectStorageHouse.getMaybeFirstItem();
        assertEquals(Optional.of(1), firstItem);
    }

    @Test
    @DisplayName("StorageHouse: testPrintItems()")
    public void testPrintItems() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        System.setOut(printStream);
        objectStorageHouse.printItems();
        System.setOut(System.out);

        String printedOutput = outputStream.toString().trim();
        List<String> expectedOutputLines = Arrays.asList("1", "2", "3", "Hello");
        List<String> printedOutputLines = Arrays.asList(printedOutput.split("\\R"));

        assertEquals(expectedOutputLines, printedOutputLines);
    }
}