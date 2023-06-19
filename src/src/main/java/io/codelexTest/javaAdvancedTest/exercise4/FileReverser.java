package io.codelexTest.javaAdvancedTest.exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReverser {
    public static void main(String[] args) {
        String filePath = "src/src/main/resources/collections/lear.txt";
        reverseFile(filePath);
    }

    public static void reverseFile(String filePath) {
        try {
            String originalContent = Files.readString(Path.of(filePath));
            String reversedContent = new StringBuilder(originalContent).reverse().toString();

            Path originalPath = Path.of(filePath);
            String originalFileName = originalPath.getFileName().toString();
            String reversedFileName = new StringBuilder(originalFileName).reverse().toString();

            System.out.println("File reversed and titled as: " + reversedFileName);
            System.out.println("Reversed Content:\n" + reversedContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}