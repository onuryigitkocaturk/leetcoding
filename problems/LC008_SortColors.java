public class LC008_SortColors {

    // Runtime: O(n), Space Complexity: O(1)
    public void sortColors(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int k = low;

        while(k <= high) {
            if(arr[k] == 0) {
                swap(arr,k,low);
                k += 1;
                low += 1;
            }
            else if(arr[k] == 1) {
                k += 1;
            }
            else {
                swap(arr,k,high);
                high -= 1;
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
