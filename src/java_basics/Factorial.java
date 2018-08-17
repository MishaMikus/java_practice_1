package java_basics;

/*
get factorial
*/
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(factorialRecursion(10));
    }

    public static int factorial(int n) {
        int ret = 1;
        for (int i = 1; i <= n; ++i) ret *= i;
        return ret;
    }

    public static int factorialRecursion(int n) {
        if (n == 0) return 1;
        return n * factorialRecursion(n - 1);
    }
}