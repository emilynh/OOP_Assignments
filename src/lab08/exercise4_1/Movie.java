package lab08.exercise4_1;
import java.io.*;
import java.util.*;

public class Movie implements Comparable<Movie>{
    private String name;
    private double rating;
    private int year;

    public int compareTo(Movie movie){
        if(year < movie.year){
            return -1;
        }
        if(year == movie.year){
            return 0;
        }
        return 1;
//        return Integer.compare(year,movie.year);
    }

    public Movie(String name, double rating, int year){
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

}
