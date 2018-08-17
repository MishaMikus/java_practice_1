package java_basics.hw_1;

/*
3. Create program , which print 0…100  numbers in console(using FOR loop)
4. Create program , which print 100…0  numbers in console(using WHILE loop)
*/

public class Loop {
    public static void main(String[] args) {
        forLoop(10);
        whileLoop(10);
        doWhileLoop(10);
    }

    private static void whileLoop(int n) {
        System.out.println("whileLoop(" + n + ")");
        int i = n;
        while (i != 0) {
            System.out.println(i--);
        }
        System.out.println();
    }

    private static void forLoop(int n) {
        System.out.println("forLoop(" + n + ")");
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
        System.out.println();
    }

    private static void doWhileLoop(int n) {
        System.out.println("doWhileLoop(" + n + ")");
        int i = n;
        do {
            System.out.println(i--);
        }
        while (i != 0);
        System.out.println();
    }
}
