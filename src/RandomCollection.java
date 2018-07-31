import java.util.*;

//HW_3_2
public class RandomCollection {
    private static final int DEFAULT_ARRAY_LENGTH = 10;
    private static final int DEFAULT_MAX_RANDOM_INT = 9999;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        List<Integer> intArray = makeRandomList();
        System.out.println("randomList : " + intArray);
        Collections.sort(intArray);
        System.out.println("sortedList : " + intArray);
    }

    private static List<Integer> makeRandomList() {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < DEFAULT_ARRAY_LENGTH; i++) {
            res.add(RANDOM.nextInt(DEFAULT_MAX_RANDOM_INT));
        }
        return res;
    }
}
