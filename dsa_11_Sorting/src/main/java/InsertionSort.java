public class InsertionSort {

    static int[] insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int toBeInserted = array[i];
            int j = i - 1;
            while (j >= 0 && toBeInserted < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = toBeInserted;
        }
        return array;
    }
}
