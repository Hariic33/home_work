package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private String title;
    private boolean isCheckedOut;
    private double averageRating;

    public Video(String title) {
        this.title = title;
        isCheckedOut = false;
        averageRating = 0.0;
    }

    public void checkOut() {
        isCheckedOut = true;
    }

    public void returnVideo() {
        isCheckedOut = false;
    }

    public void receiveRating(double rating) {
        if (rating >= 0 && rating <= 5) {
            averageRating = (averageRating + rating) / 2;
        } else {
            System.out.println("Invalid rating. Rating must be between 0 and 5.");
        }
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public double getAverageRating() {
        return averageRating;
    }
}
