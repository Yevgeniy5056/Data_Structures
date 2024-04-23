import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {

        Map<Integer, String> mapOfStudents = new HashMap<>();
        mapOfStudents.put(1, "Jack");
        mapOfStudents.put(2, "Julia");
        String s = "Java Developer";

        System.out.println(findFirstNonRepeating(s));
    }

    public static Character findFirstNonRepeating(String s) {

        HashMap<Character, Integer> map = new LinkedHashMap<>();

        var count = 0;
        for (var ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                count = map.get(ch);
                map.put(ch, count + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (var ch : s.toCharArray()) {
            if (Character.isAlphabetic(ch) & map.get(ch) == 1) {
                return ch;
            }
        }
        return null;
    }
}