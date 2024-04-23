import java.util.HashMap;

public class GenerateDocumentProblem {
    public static void main(String[] args) {
        String list = "!veDJaCyd vaeo perelo xw";
        String doc = "Cydeo Java Developer";

        System.out.println(generateDocBruteForce(list, doc));
        System.out.println(generateDocOptimal(list,doc));
    }

    private static boolean generateDocBruteForce(String list, String doc) {

        for (int i = 0; i < doc.length(); i++) {
            char ch = doc.charAt(i);
            int docCharFreq = countCharFreq(ch, doc);
            int charListFreq = countCharFreq(ch, list);
            if (docCharFreq > charListFreq) return false;
        }
        return true;
    }

    private static int countCharFreq(Character character, String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == character) count++;
        }
        return count;
    }

    private static boolean generateDocOptimal(String list, String doc) {

        HashMap<Character, Integer> mapOfChars = new HashMap<>();

        for (int i = 0; i < list.length(); i++) {
            char character = list.charAt(i);
            mapOfChars.put(character, mapOfChars.getOrDefault(character, 0) + 1);
        }
        for (int i = 0; i < doc.length(); i++) {
            char character = doc.charAt(i);
            if (!mapOfChars.containsKey(character) || mapOfChars.get(character) == 0) return false;
            mapOfChars.put(character, mapOfChars.get(character) - 1);
        }
        return true;
    }
}
