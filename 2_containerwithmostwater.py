class Solution:
    # brute force: time complexity:o(n^2), space complexity:o(1)
    def maxArea(self, height: List[int]) -> int:
        max_area = 0

        for i in range(len(height)):
            for j in range(i + 1, len(height)):
                h = min(height[i], height[j])
                w = j - i

                area = h * w
                max_area = max(area, max_area)
        return max_area

    # two pointer: time complexity:0(n)
    def maxArea(self, height: [int]) -> int:
        left_ptr = 0
        right_ptr = len(height) - 1
        max_area = 0

        while right_ptr > left_ptr:
            h = min(height[right_ptr], height[left_ptr])
            w = right_ptr - left_ptr
            area = h * w

            max_area = max(area, max_area)

            if height[left_ptr] > height[right_ptr]:
                right_ptr -= 1
            else:
                left_ptr += 1
        return max_area
