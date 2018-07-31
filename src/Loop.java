
//HW_1_3 and HW_1_4
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
