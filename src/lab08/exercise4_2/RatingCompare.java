package lab08.exercise4_2;

import java.util.*;
import java.io.*;

public class RatingCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right){
        return Double.compare(left.getRate(), right.getRate());
    }
}
