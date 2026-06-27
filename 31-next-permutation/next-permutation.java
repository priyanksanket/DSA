class Solution {
    void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = arr[high], i = (low - 1);
            for (int j = low; j < high; j++) {
                
                if (arr[j] <= pivot) {
                    i++;
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
            int t = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = t;
            int pi = i + 1;
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 1;
        while (i > 0) {
            if (nums[i] > nums[i - 1]) {
                int k = n-1;
                while(nums[k]<=nums[i-1]){
                    k--;
                }
                int temp = nums[k];
                nums[k]= nums[i-1];
                nums[i-1]= temp;
                sort(nums, i, n - 1);
                return;

            }
            i--;
        }
        sort(nums, 0, n - 1);
        return;

    }
}