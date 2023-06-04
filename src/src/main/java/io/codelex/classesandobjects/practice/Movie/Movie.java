package io.codelex.classesandobjects.practice.Movie;

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

