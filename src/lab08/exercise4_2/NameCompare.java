package lab08.exercise4_2;

import java.util.*;
import java.io.*;

public class NameCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right){
        return left.getName().compareTo(right.getName());
    }
}
