import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimalSolution {
    public static void main(String[] args) {
        int[] array = new int[]{4, 7, 2, 11};
        System.out.println(Arrays.toString(twoSumOptimalSolution(array, 9)));
    }

    public static int[] twoSumOptimalSolution(int[] arr, int targetValue) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int potentialMatch = targetValue - arr[i];
            if (map.containsKey(potentialMatch)) return new int[]{i, map.get(potentialMatch)};
            else map.put(arr[i], i);
        }
        return new int[]{};
    }
}