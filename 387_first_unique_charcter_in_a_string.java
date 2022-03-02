import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "aabbcdddddc";
        System.out.println("First non repeating character index is: "+firstUniqChar(s));
    }

    private static int firstUniqChar(String s) {
        Map<Character, Integer> characterIntegerMap = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if (characterIntegerMap.containsKey(s.charAt(i))) {
                characterIntegerMap.put(s.charAt(i), characterIntegerMap.get(s.charAt(i)) + 1);
                continue;
            }
            characterIntegerMap.put(s.charAt(i), 1);
        }

        for(char key : characterIntegerMap.keySet()) {
            if (characterIntegerMap.get(key) == 1) {
                return s.indexOf(key);
            }
        }
        return -1;
    }
}
