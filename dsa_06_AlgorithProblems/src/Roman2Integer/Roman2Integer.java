package Roman2Integer;

import java.util.HashMap;
import java.util.Map;

public class Roman2Integer {
    public static void main(String[] args) {

        System.out.println(romanToInteger("CMXCIV"));

    }

    static int romanToInteger(String s) {
        // ("M", 1000); ("D", 500);("C", 100);("L", 50);("X", 10);("V", 5);("I", 1);
        // Create Map for Roman Numerals <String, Integer>
        Map<String, Integer> map = new HashMap<>();
        map.put("M", 1000);
        map.put("D", 500);
        map.put("C", 100);
        map.put("L", 50);
        map.put("X", 10);
        map.put("V", 5);
        map.put("I", 1);
        // create variables for sum, index
        int sum = 0;
        int i = 0;
        // while loop until index reaches end of string
        while (i < s.length()) {
            String currSymbol = s.substring(i, i + 1);
            int currentValue = map.get(currSymbol);
            int nextValue = 0;
            if (i + 1 < s.length()) {
                String nextSymbol = s.substring(i + 1, i + 2);
                nextValue = map.get(nextSymbol);
            }
            if (currentValue < nextValue) {
                sum += nextValue - currentValue;
                i += 2;
            } else {
                sum += currentValue;
                i++;
            }
        }
        return sum;
    }
}