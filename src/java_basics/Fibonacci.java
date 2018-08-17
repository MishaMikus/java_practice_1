package java_basics;
/*
get fibonacci row
*/

public class Fibonacci {
    public static void main(String[] args) {
        int[] res = fibonacci(10);
        for (int i = 0; i < res.length; i++) {
            System.out.print(" ");
            System.out.print(res[i]);
        }
    }

    public static int[] fibonacci(int n) {
        int[] res = new int[n];
        for (int i = 1; i < n + 1; i++) {
            if (i == 1 || i == 2) {
                //first 2 results equal 1
                res[i - 1] = 1;
            } else {
                //other results are summ of the previous two
                res[i - 1] = res[i - 2] + res[i - 3];
            }
        }
        return res;
    }
}
