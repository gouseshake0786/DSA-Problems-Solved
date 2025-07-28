class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);  // Sort the array
        List<List<Integer>> res = new ArrayList<>();

        for (int a = 0; a < nums.length - 3; a++) {
            if (a > 0 && nums[a] == nums[a - 1]) continue;

            for (int b = a + 1; b < nums.length - 2; b++) {
                if (b > a + 1 && nums[b] == nums[b - 1]) continue;

                // Early pruning optimization
                if ((long) nums[a] + nums[b] + nums[b + 1] + nums[b + 2] > target) break;
                if ((long) nums[a] + nums[b] + nums[nums.length - 1] + nums[nums.length - 2] < target) continue;

                int c = b + 1, d = nums.length - 1;

                while (c < d) {
                    long sum = (long) nums[a] + nums[b] + nums[c] + nums[d];

                    if (sum == target) {
                        res.add(Arrays.asList(nums[a], nums[b], nums[c], nums[d]));

                        while (c < d && nums[c] == nums[c + 1]) c++;
                        while (c < d && nums[d] == nums[d - 1]) d--;

                        c++;
                        d--;
                    } else if (sum < target) {
                        c++;
                    } else {
                        d--;
                    }
                }
            }
        }

        return res;
    }
}