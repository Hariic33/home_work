package io.codelex.collections.practice;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "src/src/main/resources/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException {
        final String scores = fileContent();
        Map<String, Integer> scoreRanges = new LinkedHashMap<>();
        for (int i = 0; i <= 100; i += 10) {
            scoreRanges.put(String.format("%02d-%02d", i, i + 9), 0);
        }

        String[] scoreArray = scores.split(" ");
        for (String scoreStr : scoreArray) {
            int score = Integer.parseInt(scoreStr.trim());
            scoreRanges.computeIfPresent(getRange(score), (k, v) -> v + 1);
        }

        scoreRanges.forEach((range, count) -> {
            String stars = "*".repeat(count);
            System.out.println(range + ": " + stars);
        });
    }

    private static String fileContent() throws IOException {
        Path path = Paths.get(file).toAbsolutePath();
        return Files.readString(path, charset);
    }

    private static String getRange(int score) {
        int lowerBound = score / 10 * 10;
        int upperBound = lowerBound + 9;
        return String.format("%02d-%02d", lowerBound, upperBound);
    }
}