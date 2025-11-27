public class LC003_BinarySearch {

    // Time complexity: O(log n)
    // Space complexity: O(1)
    public int binarySearch(int[] nums, int target) {
        int headPtr = 0;
        int tailPtr = nums.length - 1;

        while (tailPtr >= headPtr) {
            int middle = (tailPtr + headPtr) / 2;

            if (target == nums[middle]) {
                return middle;
            }
            if (target > nums[middle]) {
                headPtr = middle + 1;
            }
            else {
                tailPtr = middle - 1;
            }
        }
        return -1;
    }
}

