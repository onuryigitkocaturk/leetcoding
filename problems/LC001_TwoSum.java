import java.util.HashMap;
import java.util.Map;

public class LC001_TwoSum {

    // Time complexity: O(n^2)
    // Space complexity: O(1)
    public int[] twoSumBruteForce(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
    }

    // Time complexity: O(n)
    // Space complexity: O(n)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> valueToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (valueToIndex.containsKey(complement)) {
                return new int[] {valueToIndex.get(complement), i};
            }
            valueToIndex.put(nums[i], i);
        }
        return new int[0];
    }
}
