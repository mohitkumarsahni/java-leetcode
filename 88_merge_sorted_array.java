import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int[] nums1 = new int[]{0};
        int m = 0;
        int[] nums2 = new int[]{1};
        int n = 1;
        merge(nums1, m, nums2, n);
        System.out.println("Merged array is :"+ Arrays.toString(nums1));
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        for(int i = m + n - 1; i >= 0; i--) {
            //base case check for pointers.
            if (p1 < 0) {
                nums1[i] = nums2[p2];
                p2--;
                continue;
            } else if (p2 < 0) {
                nums1[i] = nums1[p1];
                p1--;
                continue;
            }

            //conditional check for copying greater element.
            if (nums1[p1] >= nums2[p2]) {
                nums1[i] = nums1[p1];
                p1--;
            } else if (nums2[p2] > nums1[p1]) {
                nums1[i] = nums2[p2];
                p2--;
            }
        }
    }
}
