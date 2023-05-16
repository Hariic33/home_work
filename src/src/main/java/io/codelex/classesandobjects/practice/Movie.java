package io.codelex.classesandobjects.practice;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        rating = "PG";
    }

    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }

    public static Movie[] getPG(Movie[] movies) {
        List<Movie> pgMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.rating.equals("PG")) {
                pgMovies.add(movie);
            }
        }
        return pgMovies.toArray(new Movie[0]);
    }

}

class PG_Movies {
    public static void main(String[] args) {
        Movie[] movies = {
                new Movie("Casino Royale", "Eon Productions", "PG13"),
                new Movie("Glass", "Buena Vista International", "PG13"),
                new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG")
        };

        Movie[] pgMovies = Movie.getPG(movies);
        for (Movie movie : pgMovies) {
            System.out.println(movie.getTitle());
            System.out.println(movie.getStudio());
        }
    }
}