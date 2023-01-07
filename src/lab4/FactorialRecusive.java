package lab4;

public class FactorialRecusive {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial(" + n + ")" + " = " + factorial(n));
    }

    public static int factorial(int n) {
        if (n >= 1)
            return n * factorial(n - 1);
        else
            return 1;
    }
}
// Factorial(5) = 120