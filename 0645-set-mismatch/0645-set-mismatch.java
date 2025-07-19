class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int idx = nums[i] - 1;
            if (nums[i] != nums[idx]) {
                swap(nums, i, idx);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1)
                return new int[] { nums[j], j + 1 };
        }

        return new int[] { -1, -1 };
    }

    void swap(int[] arr, int id1, int id2) {
        int temp = arr[id1];
        arr[id1] = arr[id2];
        arr[id2] = temp;
    }
}