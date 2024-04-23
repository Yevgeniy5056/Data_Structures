import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {

        Set<Student> set = new LinkedHashSet<>();

        set.add(new Student(1, "Jack"));
        set.add(new Student(2, "Julia"));
        set.add(new Student(4, "Mary"));
        set.add(new Student(3, "Mike"));
        set.add(new Student(4, "Mary"));

        System.out.println(set);


        System.out.println(firstRepeatingChar("Java Developer"));
    }

    private static Character firstRepeatingChar(String s) {

        var hashSet = new HashSet<>();

        for (var character : s.toCharArray()) {
            if (!hashSet.add(character)) {
                return character;
            }
        }
        return null;
    }
}