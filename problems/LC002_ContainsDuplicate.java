import java.util.HashSet;
import java.util.Set;

public class LC002_ContainsDuplicate {

    // Time complexity: O(n^2)
    // Space complexity: O(1)
    public boolean containsDuplicateBruteForce(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Time complexity: O(n)
    // Space complexity: O(n)
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> checkList = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (checkList.contains(nums[i])) {
                return true;
            }
            checkList.add(nums[i]);
        }
        return false;
    }
}