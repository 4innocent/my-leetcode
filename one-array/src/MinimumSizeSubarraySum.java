public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }

    /**
     * 209. 长度最小的子数组
     * 给定一个含有n个正整数的数组和一个正整数 target 。
     *
     * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组[numsl, numsl+1, ..., numsr-1, numsr] ，
     * 并返回其长度。如果不存在符合条件的子数组，返回 0 。
     *
     * @param target
     * @param nums
     * @return
     */
    public static int minSubArrayLen(int target, int[] nums) {
        int len = 0;
        int left = 0;
        int right = 1;
        int sum = nums[left];
        if (sum >= target) return 1;
        if (nums[nums.length - 1] >= target) return 1;
        while(left < nums.length - 1){
            if(sum >= target){
                if (len == 0){
                    len = right - left;
                }else {
                    len = Math.min(len, right - left);
                }
                sum -= nums[left];
                left++;
            }else{
                if (right <= nums.length - 1){
                    sum += nums[right];
                    right++;
                }else break;
            }
        }
        return len;
    }
}
