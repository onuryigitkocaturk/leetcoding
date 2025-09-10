class Solution:
    # time complexity:o(n), space complexity:o(1), question asked to use o(1) space complexity
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        left_ptr = 0
        right_ptr = len(numbers) - 1
        while right_ptr > left_ptr:
            total = numbers[left_ptr] + numbers[right_ptr]
            if total == target:
                return [left_ptr + 1, right_ptr + 1]
            elif total < target:
                left_ptr += 1
            else:
                right_ptr -= 1
