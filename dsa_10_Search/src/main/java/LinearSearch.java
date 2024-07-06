public class LinearSearch {

    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(linearSearch(array, 5));
    }

    private static int linearSearch(int[] array, int data) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == data) return i;
        }
        return -1;
    }
}
