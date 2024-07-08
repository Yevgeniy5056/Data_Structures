import java.util.Arrays;

public class SortingMain {

    public static void main(String[] args) {

        int[] nums = {7, 2, 4, 6, 1, 9, -1};
        int[] nums2 = {7, 12, 31, 4, 11, 1, 9, -1};
        int[] nums3 = {7, 12, 31, 15, 11, 1, 9, -1};

        System.out.println("Selection: " + Arrays.toString(SelectionSort.selectionSort(nums)));
        System.out.println("Bubble: " + Arrays.toString(BubbleSort.bubbleSort(nums2)));
        System.out.println("Insertion: " + Arrays.toString(InsertionSort.insertionSort(nums3)));
    }
}
