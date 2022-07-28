public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] ints = sortedSquares(nums);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    // 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
    public static int[] sortedSquares(int[] nums) {
        if (nums.length == 0) return nums;
        int left = 0;
        int right = nums.length - 1;
        int[] target = new int[nums.length];
        int count = right;
        while(left <= right){
            int rightPow = nums[right] * nums[right];
            int leftPow = nums[left] * nums[left];
            if (rightPow > leftPow){
                target[count] = rightPow;
                right--;
            }else{
                target[count] = leftPow;
                left++;
            }
            count--;
        }
        return target;
    }
}
