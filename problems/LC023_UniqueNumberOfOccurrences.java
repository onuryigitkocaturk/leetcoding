import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC023_UniqueNumberOfOccurrences {

    // my first approach, ai suggested better one.
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occMap = new HashMap<>();

        for (int i : arr) {
            occMap.put(i, occMap.getOrDefault(i,0) + 1);
        }

        Map<Integer, Integer> resultMap = new HashMap<>();

        for (int i : occMap.values()) {
            resultMap.put(i, resultMap.getOrDefault(i,0) + 1);
        }

        Set<Integer> resultSet = new HashSet<>();

        for (int i : resultMap.values()) {
            if (i == 1) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    // solution by gpt
    public boolean uniqueOccurrencesByGpt(int[] arr) {
        Map<Integer, Integer> occMap = new HashMap<>();

        for (int x : arr) {
            occMap.put(x, occMap.getOrDefault(x, 0) + 1);
        }

        Set<Integer> set = new HashSet<>(occMap.values());
        return set.size() == occMap.size();
    }
}
