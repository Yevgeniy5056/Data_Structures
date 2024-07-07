public class ExponentialSearch {

    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(exponentialSearch(array, 5));
    }

    private static int exponentialSearch(int[] array, int data) {
        int bound = 1;
        while (bound < array.length && array[bound] < data) bound *= 2;
        int left = bound / 2;
        int right = Math.min(bound, array.length - 1);
        return BinarySearch.binarySearchRec(array, data, left, right);
    }
}
