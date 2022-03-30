import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String s = "A1:F1";
        System.out.println("All cells: "+cellsInRange(s));
    }

    private static List<String> cellsInRange(String s) {
        int s0 = s.charAt(0);
        int s3 = s.charAt(3);
        int s1 = Integer.parseInt(String.valueOf(s.charAt(1)));
        int s4 = Integer.parseInt(String.valueOf(s.charAt(4)));

        List<String> result = new ArrayList<>();
        for (int i = s0; i <= s3; i++) {
            for (int j = s1; j <= s4; j++) {
                char x = (char) i;
                String sb = String.valueOf(x) + j;
                result.add(sb);
            }
        }
        return result;
    }
}
