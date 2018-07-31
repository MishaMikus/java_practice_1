public class MinMax2D {
    public static int min(int[][] data) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] < min) {
                    min = data[i][j];
                }
            }
        }
        return min;
    }

    public static int max(int[][] data) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] > max) {
                    max = data[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(min(new int[][]{{-1, 2, 8}, {3, 6, 2}, {6, 3, 7}}));
        System.out.println(max(new int[][]{{-1, 2, 8}, {3, 6, 2}, {6, 3, 7}}));
    }
}
