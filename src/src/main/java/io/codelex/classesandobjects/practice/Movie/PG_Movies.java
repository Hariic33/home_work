package io.codelex.classesandobjects.practice.Movie;

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
