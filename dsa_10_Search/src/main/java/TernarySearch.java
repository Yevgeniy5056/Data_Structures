public class TernarySearch {

    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(ternarySearchIterative(array, 5));
        System.out.println(ternarySearchRec(array, 5, 0, array.length - 1));
    }

    private static int ternarySearchIterative(int[] array, int data) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int partition = (right - left) / 3;
            int middle1 = left + partition;
            int middle2 = right - partition;
            if (array[middle1] == data) return middle1;
            if (array[middle2] == data) return middle2;
            if (data < array[middle1]) right = middle1 - 1;
            if (data > array[middle2]) left = middle2 + 1;
            else {
                left = middle1 + 1;
                right = middle2 - 1;
            }
        }
        return -1;
    }

    private static int ternarySearchRec(int[] array, int data, int left, int right) {
        if (left > right) return -1;
        int partition = (right - left) / 3;
        int middle1 = left + partition;
        int middle2 = right - partition;
        if (array[middle1] == data) return middle1;
        if (array[middle2] == data) return middle2;
        if (data < array[middle1]) return ternarySearchRec(array, data, left, middle1 - 1);
        if (data > array[middle2]) return ternarySearchRec(array, data, middle2 + 1, right);
        else return ternarySearchRec(array, data, middle1 + 1, middle2 - 1);
    }
}
