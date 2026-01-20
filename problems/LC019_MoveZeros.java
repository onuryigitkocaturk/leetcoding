public class LC019_MoveZeros {

    // Time complexity: O(n)
    // Space complexity: O(1)
    public void MoveZeros(int[] nums) {
        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {

            if (nums[fast] != 0) {
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;

                slow++;
            }
        }
    }
}
