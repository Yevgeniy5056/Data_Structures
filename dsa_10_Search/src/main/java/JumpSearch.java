public class JumpSearch {

    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(jumpSearch(array, 5));
    }

    private static int jumpSearch(int[] array, int data) {
        int blockSize = (int) Math.sqrt(array.length);
        int start = 0;
        int next = blockSize;
        while (start < array.length && array[next - 1] < data) {
            start = next;
            next += blockSize;
            if (next > array.length) next = array.length;
        }
        for (int i = start; i < next; i++) {
            if (array[i] == data) return i;
        }
        return -1;
    }
}
