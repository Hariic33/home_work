package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "src/src/main/resources/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(file).toAbsolutePath();
        long lineCount = 0;
        long wordCount = 0;
        long charCount = 0;

        for (String line : Files.readAllLines(path, charset)) {
            lineCount++;
            charCount += line.length();
            wordCount += countWords(line);
        }
        
        System.out.println("Lines = " + lineCount);
        System.out.println("Words = " + wordCount);
        System.out.println("Chars = " + charCount);
    }

    public static int countWords(String line) {
        int count = 0;
        boolean insideWord = false;

        for (char c : line.toCharArray()) {
            if (Character.isLetterOrDigit(c) || c == '\'') {
                if (!insideWord) {
                    count++;
                    insideWord = true;
                }
            } else {
                insideWord = false;
            }
        }
        return count;
    }
}