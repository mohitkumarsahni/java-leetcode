import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int[] nums = new int[]{5,4,-1,7,8};

        //Divide & Conquer solution.
        //Explaination: https://www.youtube.com/watch?v=yBCzO0FpsVc
        System.out.println("Maximum Sum from SubArray: "+maxSubArray(nums));
    }

    private static int maxSubArray(int[] nums) {
        return maxSubArray(nums, 0, nums.length-1);
    }

    private static int maxSubArray(int[] nums, int p, int r) {
        if (p == r) {
            return nums[p];
        }

        int q = (p + r)/2;
        int leftSubArraySum = maxSubArray(nums, p, q);
        int rightSubArraySum = maxSubArray(nums, q+1, r);
        int crossingSubArraySum = maxCrossingSubArraySum(nums, p, q, r);

        if (leftSubArraySum >= rightSubArraySum && leftSubArraySum >= crossingSubArraySum)
            return leftSubArraySum;
        else if (rightSubArraySum >= leftSubArraySum && rightSubArraySum >= crossingSubArraySum)
            return rightSubArraySum;
        return crossingSubArraySum;
    }

    private static int maxCrossingSubArraySum(int[] nums, int p, int q, int r) {
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = q; i >= p; i--) {
            sum = sum + nums[i];
            if (sum > leftSum)
                leftSum = sum;
        }
        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for(int i = q+1; i <= r; i++) {
            sum = sum + nums[i];
            if (sum > rightSum)
                rightSum = sum;
        }
        return leftSum + rightSum;
    }
}
