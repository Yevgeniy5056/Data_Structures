import java.util.Arrays;

public class SortingMain {

    public static void main(String[] args) {

        int[] nums1 = {7, 2, 4, 6, 1, 9, -1};
        int[] nums2 = {7, 12, 31, 4, 11, 1, 9, -1};
        int[] nums3 = {7, 12, 31, 15, 11, 1, 9, -1};
        int[] nums4 = {7, 12, 44, 33, 31, 15, 11, 1, 9, -1};
        int[] nums5 = {7, 12, 44, 33, 31, 15, 11, 1, 9, -1, -20, 50};

        System.out.println("SelectionSort: " + Arrays.toString(SelectionSort.selectionSort(nums1)));
        System.out.println("BubbleSort: " + Arrays.toString(BubbleSort.bubbleSort(nums2)));
        System.out.println("InsertionSort: " + Arrays.toString(InsertionSort.insertionSort(nums3)));
        System.out.println("MergeSort: " + Arrays.toString(MergeSort.mergeSort(nums4)));
        QuickSort.qSort(nums5, 0, nums5.length - 1);
        System.out.println("QuickSort:" + Arrays.toString(nums5));
    }
}
