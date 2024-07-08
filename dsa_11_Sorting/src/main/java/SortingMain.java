import java.util.Arrays;

public class SortingMain {

    public static void main(String[] args) {

        int[] nums = {7, 2, 4, 6, 1, 9, -1};
        System.out.println("Selection: " + Arrays.toString(SelectionSort.selectionSort(nums)));
        System.out.println("Bubble: " + Arrays.toString(BubbleSort.bubbleSort(nums)));
    }
}
