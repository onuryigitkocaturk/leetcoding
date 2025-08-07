class Solution:
    # time complexity: o(n) space complexity: o(n)
    def isPalindrome(self, s: str) -> bool:
        new = ""
        for c in s:
            if c.isalnum():
                new += c.lower()
        s = new

        left_ptr = 0
        right_ptr = len(s) - 1

        for i in range(len(s)):
            if s[left_ptr] == s[right_ptr]:
                left_ptr += 1
                right_ptr -= 1
                continue
            else:
                return False
        return True
