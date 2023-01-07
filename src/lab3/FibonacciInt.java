
public class FibonacciInt {

    public static void main(String[] args) {
        int term = 46;
        Fibonacci(term);

    }

    public static void Fibonacci(int term) {
        int f0 = 1;
        int f1 = 1;
        int fn = 0;
        for (int i = 2; i < term; i++) {
            if (term < 2) {
                System.out.println(term);
            } else {
                fn = f0 + f1;
                f0 = f1;
                f1 = fn;
                System.out.println("F(" + i + ") =" + fn);
            }
        }
    }

}
