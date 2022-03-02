import java.util.*;

public class Main {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println("Can we construct ransom note from magazine: "+canConstruct(ransomNote, magazine));
        System.out.println("Can we construct ransom note from magazine: "+checkViaArrayOnly(ransomNote, magazine));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomNoteCharactersFrequency = new HashMap<>();
        Map<Character, Integer> magazineCharactersFrequency = new HashMap<>();
        storeFrequencyMap(ransomNote, ransomNoteCharactersFrequency);

        storeFrequencyMap(magazine, magazineCharactersFrequency);

        for(char key : ransomNoteCharactersFrequency.keySet()) {
            if (!magazineCharactersFrequency.containsKey(key) || magazineCharactersFrequency.get(key) < ransomNoteCharactersFrequency.get(key)) {
                return false;
            }
        }
        return true;
    }

    private static void storeFrequencyMap(String s, Map<Character, Integer> charactersFrequency) {
        for (int i = 0; i < s.length(); i++) {
            if (charactersFrequency.containsKey(s.charAt(i))) {
                charactersFrequency.put(s.charAt(i), charactersFrequency.get(s.charAt(i)) + 1);
                continue;
            }
            charactersFrequency.put(s.charAt(i), 1);
        }
    }

    //store the frequency of magazine characters in to an array.
    //loop through the ransom note string.
    //each time you get a character decrease the frequency
    //and check if it greater than zero or not.
    // if it is not then the characters required are not enough in magazine.
    private static boolean checkViaArrayOnly(String ransomNote, String magazine) {
        int[] hash = new int[26];
        for (char c : magazine.toCharArray())
            ++hash[c-'a'];
        for (char c : ransomNote.toCharArray())
            if (--hash[c-'a'] < 0)
                return false;
        return true;
    }
}
