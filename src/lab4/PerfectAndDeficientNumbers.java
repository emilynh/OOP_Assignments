package lab4;

public class PerfectAndDeficientNumbers {
    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0)
                sum = sum + i;
        }
        return sum == aPosInt;
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                // If divisors are equal, take only one
                // of them
                if (aPosInt / i == i) {
                    sum = sum + i;
                } else // Otherwise take both
                {
                    sum = sum + i;
                    sum = sum + (aPosInt / i);
                }
            }
        }
        return sum < 2 * aPosInt;
    }

    public static void getPerfectNumber(int theUpperBound) {
        int count = 0;
        System.out.println("These numbers are perfect: ");
        for (int i = 1; i < theUpperBound; i++) {
            if (isPerfect(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        double percent = 1.0 * count / theUpperBound;
        System.out.printf("%d perfect numbers found (%f%%)", count, percent);
        System.out.println();
    }

    public static void getDeficientNumber(int theUpperBound) {
        int count = 0;
        System.out.println("These numbers are deficient: ");
        for (int i = 1; i < theUpperBound; i++) {
            if (isDeficient(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        double percent = 1.0 * count / theUpperBound;
        System.out.printf("%d deficient numbers found (%f%%)", count, percent);
        System.out.println();

    }

    public static void main(String[] args) {
        getPerfectNumber(1000);
        getDeficientNumber(1000);
        System.out.println("These numbers are neither deficient nor perfect: ");
        for (int i = 1; i <= 1000; i++) {
            if (isPerfect(i) == false && isDeficient(i) == false) {
                System.out.print(i + " ");
            }
        }
    }
}

