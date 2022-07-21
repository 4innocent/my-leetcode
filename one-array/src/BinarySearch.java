/**
 * <a href="https://leetcode.cn/problems/binary-search/" />
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        System.out.println(solution(nums, target));
    }

    public static int solution(int[] nums, int target){
        if (nums.length == 0) return -1;
        if(nums[0] > target || nums[nums.length - 1] < target) return -1;
        int left = 0;
        int right = nums.length - 1;
        int middle = (right - left) / 2;
        while(left <= right){ // left == right时退出循环
            if (target > nums[middle]){
                left = middle + 1; // middle已经验证过，必定不是target，不排除middle的话，right-left差为1，会陷入死循环
                middle = left + (right - left) / 2;
            }else if (target < nums[middle]){
                right = middle - 1;
                middle = right - (right - left) / 2;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
