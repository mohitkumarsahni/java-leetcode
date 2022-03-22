import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        String jewels = "zZc";
        String stones = "ZZccx";
        System.out.println("Number of Jewels we have: "+numJewelsInStonesUsingIndexOf(jewels, stones));
    }

    private static int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> characterSet = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            characterSet.add(jewels.charAt(i));
        }

        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (characterSet.contains(stones.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    private static int numJewelsInStonesUsingIndexOf(String jewels, String stones) {
        char []temp = stones.toCharArray();
        int n = 0;
        for (char c : temp) {
            if (jewels.indexOf(c) != -1) {
                n++;
            }
        }
        return n;
    }
}
