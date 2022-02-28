import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] nums1 = new int[]{1,2,2,1};
        int m = 0;
        int[] nums2 = new int[]{2,2};
        int n = 1;

        System.out.println("Merged array is :"+ Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> arr = new ArrayList<>();
        int[] resultArray;

        Map<Integer, Integer> map_1 = new HashMap<>();
        Map<Integer, Integer> map_2 = new HashMap<>();

        extracted(nums1, map_1);
        extracted(nums2, map_2);

        if (nums1.length > nums2.length) {
            extracted(arr, map_1, map_2);
        }
        else {
            extracted(arr, map_2, map_1);
        }
        resultArray = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            resultArray[i] = arr.get(i);
        }
        return resultArray;
    }

    private static void extracted(List<Integer> arr, Map<Integer, Integer> biggerMap, Map<Integer, Integer> smallerMap) {
        for(int key : biggerMap.keySet()) {
            if(smallerMap.containsKey(key)) {
                int min = Integer.min(biggerMap.get(key), smallerMap.get(key));
                for(int i = 0; i < min; i++) {
                    arr.add(key);
                }
            }
        }
    }

    private static void extracted(int[] nums2, Map<Integer, Integer> map_2) {
        for (int j : nums2) {
            if (map_2.containsKey(j)) {
                map_2.put(j, map_2.get(j) + 1);
            } else {
                map_2.put(j, 1);
            }
        }
    }
}
