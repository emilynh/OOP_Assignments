package lab08.exercise4_2;
import java.io.*;
import java.util.*;

class Movie implements Comparable<Movie>{
    private String name;
    private double rating;
    private int year;

    public int compareTo(Movie m) {
        return Integer.compare(year, m.year);
    }

    public Movie(String name, double rating, int year){
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rating;
    }

    public int getYear() {
        return year;
    }
}

