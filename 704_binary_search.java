public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{5};
        int target = 5;
        System.out.println("Performing Binary Search, found at index: "+search(nums, target));
    }

    private static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int left = 0;
        int right = nums.length;
        int mid = 0;
        while (left < right){
            mid = (left+right)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return -1;
    }
}
