public class SimpleNumbers {

    public static void main(String[] args) {
        System.out.println(isSimpleNumber(4));
        printSimpleUpTo(100);
    }

    private static void printSimpleUpTo(int upTo) {
        System.out.println("Simple numbers on range 0.." + upTo);
        for (int i = 0; i <=upTo; i++) {
            if(isSimpleNumber(i)){
                System.out.println(i);
            }
        }
    }


    public static boolean isSimpleNumber(int number) {
        for (int i = 2; i < number; i++) {
            if ((number % i == 0) && (number != 2)) {
                return false;
            }
        }
        return true;
    }
}

