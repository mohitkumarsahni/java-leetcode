public class Main {

    public static void main(String[] args) {
        String s = "LLLLRRRR";
        System.out.println("Maximum Amount of Split Balanced Strings: "+balancedStringSplit(s));
    }

    private static int balancedStringSplit(String s) {
        int balanceCount = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                balanceCount++;
            } else {
                balanceCount--;
            }
            if (balanceCount == 0) {
                count++;
            }
        }

        return count;
    }
}
