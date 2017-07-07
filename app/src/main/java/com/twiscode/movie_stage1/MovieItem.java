package com.twiscode.movie_stage1;

/**
 * Created by Andree on 7/7/17.
 */

public class MovieItem {

    private String imgUrl;
    private String movieTitle;
    private double movieRating;
    private String movieDescription;
    private int movieID;

    public MovieItem(String imgUrl, String title, String desc, int id, double rating){
        this.imgUrl = imgUrl;
        this.movieTitle = title;
        this.movieRating = rating;
        this.movieDescription = desc;
        this.movieID = id;

    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public double getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(double movieRating) {
        this.movieRating = movieRating;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }
}
