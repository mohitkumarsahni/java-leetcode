import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int numsRow = 8;
        System.out.println("The matrix for Pascal's Triangle till row "+numsRow+", "+generate(numsRow));
    }

    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        list.add(Collections.singletonList(1));
        if (numRows == 1) {
            return list;
        } else if (numRows == 2) {
            list.add(Arrays.asList(1, 1));
            return list;
        }

        list.add(Arrays.asList(1, 1));
        for(int i = 2; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> previousRow = list.get(i - 1);
            for(int j = 0; j <= previousRow.size() ; j++) {
                if (j == 0 || j == previousRow.size()) {
                    row.add(1);
                    continue;
                }
                row.add(previousRow.get(j) + previousRow.get(j - 1));
            }
            list.add(row);
        }
        return list;
    }
}
