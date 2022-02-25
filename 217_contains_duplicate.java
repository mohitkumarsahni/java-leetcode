import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,4,4};

        System.out.println("Does the array contains duplicates: "+containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            if (hashMap.containsKey(num)) {
                hashMap.put(num, hashMap.get(num) + 1);
            } else {
                hashMap.put(num, 1);
            }
        }

        for (int key : hashMap.keySet()) {
            if (hashMap.get(key) > 1) {
                return true;
            }
        }
        return false;
    }
}
