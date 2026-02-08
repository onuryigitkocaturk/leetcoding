public class LC025_MaximumAverageSubarray {

    // Time complexity: O(n)
    // Space complexity: O(1)
    public double findMaxAverage(int[] nums, int k) {

        int left = 0;
        int right = k - 1;

        long windowSum = 0;

        for (int i = left; i <= right; i++) {
            windowSum += nums[i];
        }

        long maxSum = windowSum;

        while (right + 1 < nums.length) {
            right++;
            windowSum += nums[right];
            windowSum -= nums[left];
            left++;

            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }
        return (double) maxSum / k;
    }
}
