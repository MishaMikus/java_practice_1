package hw_3;

import java.util.Arrays;
import java.util.Random;

//HW_3_1
public class RandomArray {
    private static final int DEFAULT_ARRAY_LENGTH = 10;
    private static final int DEFAULT_MAX_RANDOM_INT = 9999;

    public static void main(String[] args) {
        int[] intArray = makeRandomArray();
        printArray("randomArray:", intArray);
        Arrays.sort(intArray);
        printArray("sortedArray:", intArray);
    }

    private static void printArray(String name, int[] intArray) {
        System.out.print(name + " : ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(" " + intArray[i] + " ");
        }
        System.out.println();
    }

    private static int[] makeRandomArray() {
        int[] res = new int[DEFAULT_ARRAY_LENGTH];
        for (int i = 0; i < DEFAULT_ARRAY_LENGTH; i++) {
            res[i] = new Random().nextInt(DEFAULT_MAX_RANDOM_INT);
        }
        return res;
    }
}
