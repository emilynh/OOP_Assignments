package lab4;

public class GCD {
    public static void main(String[] args) {
        int a = 366;
        int b = 60;
        int gcd = gcd(a, b);

        System.out.printf("GCD of %d and %d is %d.", a, b, gcd);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, (a % b));
        }
    }
}
// GCD of 366 and 60 is 6.