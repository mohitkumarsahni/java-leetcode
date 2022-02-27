import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int[] nums = new int[]{3,3};

        System.out.println("Values at indices " + Arrays.toString(twoSumUsingHashMap(nums, 6)) + " adds up to "+6+".");
    }

    //Brute Force O(n^2).
    private static int[] twoSumBruteForce(int[] nums, int target) {
        int[] indices = new int[]{-1,-1};
        for(int i = 0; i < nums.length-1; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }
        return indices;
    }

    //Using HashMap O(n).
    private static int[] twoSumUsingHashMap(int[] nums, int target) {
        int[] indices = new int[]{-1,-1};
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                indices[0] = i;
                indices[1] = map.get(target - nums[i]);
                return indices;
            }
            map.put(nums[i], i);
        }
        return indices;
    }
}
