class Solution:

    # brute force, time complexity: o(n^2) space complexity:o(1)
    def containsDuplicate(self, nums: list[int]) -> bool:
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] == nums[j]:
                    return True
        return False

    # hash map, time complexity: o(n) space complexity: o(n)
    def containsDuplicate(self, nums: List[int]) -> bool:
        seen = {}

        for i in nums:
            if i in seen:
                return True
            else:
                seen[i] = 0
        return False
