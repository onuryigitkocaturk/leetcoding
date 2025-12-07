import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC009_TopKFrequentElements {

        // Time complexity: O(n log n)
        // Space complexity: O(n)
        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer,Integer> seen = new HashMap<>();

            for (int number : nums) {
                seen.put(number, seen.getOrDefault(number,0) + 1);
            }

            List<Map.Entry<Integer,Integer>> list = new ArrayList<>(seen.entrySet());

            list.sort(Map.Entry.comparingByValue());

            int[] resultArr = new int[k];

            for (int i = 0; i < k; i++) {
                resultArr[i] = list.get(list.size() - 1 - i).getKey();
            }
            return resultArr;
        }
}

