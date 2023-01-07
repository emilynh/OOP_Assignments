package lab4;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int Num1 = 12, Num2 = 8;
//        gcd(Num1, Num2);
        System.out.println("\n GCD =  " + gcd(Num1, Num2));
    }

    public static int gcd(int Num1, int Num2) {
        int GCD = 0;
        while (Num2 != 0) {
            int Temp = Num2;
            Num2 = Num1 % Num2;
            Num1 = Temp;
        }
        return GCD = Num1;
    }
}

// GCD =  4
