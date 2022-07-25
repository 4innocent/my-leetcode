public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(solution(nums, val));
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static int solution(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int slowIndex = 0;
        int fastIndex = 0;
        while (fastIndex <= nums.length - 1) {
            if(nums[fastIndex] != val){
                nums[slowIndex++] = nums[fastIndex];
            }
            fastIndex++;
        }
        return slowIndex;
    }
}
