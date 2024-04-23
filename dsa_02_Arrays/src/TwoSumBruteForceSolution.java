import java.util.Arrays;

public class TwoSumBruteForceSolution {
    public static void main(String[] args) {
        int[] array = new int[]{4, 7, 2, 11};
        System.out.println(Arrays.toString(twoSumSolution1(array, 9)));
    }

    public static int[] twoSumSolution1(int[] array, int targetValue) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    if (array[i] + array[j] == targetValue) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[]{};
    }
}