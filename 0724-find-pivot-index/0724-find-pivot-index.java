class Solution {
    public int pivotIndex(int[] nums) {
        int tsum=0;
        for(int i=0;i<nums.length;i++){
            tsum+=nums[i];
        }
        int suml=0;
        for(int i=0;i<nums.length;i++){
            int sumr=tsum-suml-nums[i];
            if(sumr==suml)return i;
            suml+=nums[i];
        }
        return -1;
    }
}