package io.codelex.miscellaneous.triviaGame;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class TriviaApi {
    public String getTriviaFact(int randomNumber) {
        String apiUrl = "http://numbersapi.com/" + randomNumber + "/trivia";

        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
            connection.setRequestMethod("GET");

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                return reader.readLine();
            }
        } catch (Exception e) {
            System.out.println("Failed to retrieve trivia fact. Please try again later.");
        }
        return null;
    }
}