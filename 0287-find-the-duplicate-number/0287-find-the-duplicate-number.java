class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] != i + 1) {
                int corr = nums[i] - 1;
                if (nums[i] != nums[corr]) {
                    
                    swap(nums, i, corr);
                }
                else 
                    return nums[i];
            } else
                i++;
        }
        return -1;
    }

    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}