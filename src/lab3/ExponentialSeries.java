
import java.util.*;

public class ExponentialSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of term sum required: ");
        int numTerms = sc.nextInt();
        System.out.print("Enter the value for base: ");
        int x = sc.nextInt();
        System.out.println("Sum of" + numTerms + "terms = " + specialSeries(x, numTerms));

        sc.close();

    }

    public static double specialSeries(double x, int numTerms) {
        double sum = 0.0;
        int i = 0;
        double nr = 1;
        double dr = 1;
        double term = 0;
        while (i < numTerms) {
            term = nr / dr;
            sum = sum + term;
            i++;
            nr = nr * x;
            dr = dr * i;

        }
        return sum;

    }
}
