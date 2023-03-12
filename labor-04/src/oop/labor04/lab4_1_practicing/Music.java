package oop.labor04.lab4_1_practicing;

import java.util.Arrays;

public class Music {
    private String bandName;
    private String origin;
    private String genres;
    private int yearOfFoundation;
    private String[] studioAlbums;
    private double rating;

    //constructor
    public Music(String bandName, String origin, String genres, int yearOfFoundation,String[] studioAlbums, double rating) {
        this.bandName = bandName;
        this.origin = origin;
        this.genres = genres;
        this.yearOfFoundation = yearOfFoundation;
        this.studioAlbums = studioAlbums;
        this.rating = rating;
    }

    //methods
        //getMethods
    public String getBandName() {
        return bandName;
    }
    public String getOrigin() {
        return origin;
    }
    public String getGenres() {
        return genres;
    }
    public int getYearOfFoundation() {
        return yearOfFoundation;
    }
    public String[] getStudioAlbums() {
        return this.studioAlbums;
    }
    public double getRating() {
        return rating;
    }

        //setMethods
    public void setRating(int rating) {
        this.rating = rating;
    }

    //toString
    @Override
    public String toString() {
        return "\nBand Name: " + bandName + "\n" +
                "Origin: " + origin + "\n" +
                "Genres: " + genres + "\n" +
                "Year Of Foundation: " + yearOfFoundation + "\n" + "Studio Albums: " + Arrays.toString(studioAlbums) + "\nRating: " + rating + "\n";
    }

}
