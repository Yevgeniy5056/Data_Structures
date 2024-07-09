public class QuickSort {

    static void qSort(int[] array, int start, int end) {

        if (start >= end) return;
        int boundary = partition(array, start, end);
        qSort(array, start, boundary - 1);
        qSort(array, boundary + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int boundary = start;
        for (int i = start; i <= end; i++) {
            if (array[i] <= pivot) swap(array, i, boundary++);
        }
        return boundary - 1;
    }

    static void swap(int[] array, int idx1, int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
}
