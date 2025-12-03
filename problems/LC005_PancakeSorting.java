import java.util.ArrayList;
import java.util.List;

public class LC005_PancakeSorting {

    public List<Integer> pancakeSort(int[] arr) {

        List<Integer> flips = new ArrayList<>();
        int n = arr.length;

        for (int currSize = n; currSize > 1; currSize--) {
            int maxIndex = findMax(arr, currSize);

            if (maxIndex == currSize - 1) {
                continue;
            }

            if (maxIndex != 0) {
                flip(arr,maxIndex);
                flips.add(maxIndex + 1);
            }

            flip(arr,currSize - 1);
            flips.add(currSize);
        }
        return flips;
    }

    private int findMax(int[] arr, int k) {
        int maxIndex = 0;

        for (int i = 1; i < k; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private void flip(int[] arr, int k) {
        int i = 0;
        int j = k;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
