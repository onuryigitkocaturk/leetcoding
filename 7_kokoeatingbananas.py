class Solution:

    # time complexity: O(nlogM) n:piles M:max(piles) space complexity:O(1)
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        # n piles of bananas, i. pile has piles[i] bananas
        # guards come in h hours
        # koko decides hourly, we call "k", if k>piles[i], eats all and stops for an hour
        # problem wants the minimum banana per hour so that all bananas will be eaten

        min_k = 1
        max_k = max(piles)

        while max_k > min_k:
            hour = 0
            middle = (max_k + min_k) // 2

            for i in range(len(piles)):
                hour += math.ceil(piles[i] / middle)

            if hour <= h:
                max_k = middle
            else:
                min_k = middle + 1

        return max_k
