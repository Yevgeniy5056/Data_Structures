package SunsetView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SunsetViews {

    public static void main(String[] args) {

        int[] buildings = new int[]{3, 5, 4, 4, 3, 1, 3, 2};
        System.out.println(sunsetView(buildings, "EAST"));
        System.out.println(sunsetView(buildings, "WEST"));

    }

    private static ArrayList<Integer> sunsetView(int[] array, String direction) {

        Stack<Integer> stack = new Stack<>();

        int i = 0;
        int step = 1;

        if (direction.equalsIgnoreCase("west")) {
            i = array.length - 1;
            step = -1;
        }

        while (i >= 0 && i < array.length) {
            while (!stack.isEmpty() && array[i] >= array[stack.peek()]) {
                stack.pop();
            }
            stack.push(i);
            i += step;
        }

        if (direction.equalsIgnoreCase("west")) {
            Collections.reverse(stack);
        }
        return new ArrayList<>(stack);
    }
}