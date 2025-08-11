class Solution:
    # time complexity:o(nlogn), space complexity:o(n+k)
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counter_hash_map = {}
        for i in nums:
            if i not in counter_hash_map:
                counter_hash_map[i] = 1
            else:
                counter_hash_map[i] += 1

        sorted_hash_map = sorted(
            counter_hash_map.items(), key=lambda x: x[1], reverse=True
        )

        result = []

        for i in range(k):
            key = sorted_hash_map[i][0]

            result.append(key)

        return result
