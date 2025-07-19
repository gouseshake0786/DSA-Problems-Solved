class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        int i=0;
        while(i<nums.length){
            int idx = nums[i] -1;
                if(nums[i] !=nums[idx]){
                    swap(nums,i,idx);
                }
                else{
                    i++;
                }
        }

        for(int idx = 0; idx<nums.length;idx++){
            if(nums[idx] != idx+1)
                res.add(nums[idx]);
        }
        return res;
    }

    void swap(int[] arr, int id1, int id2){
        int temp = arr[id1];
        arr[id1] = arr[id2];
        arr[id2] = temp;
    }
}