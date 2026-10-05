class Solution {
    public int arraySign(int[] nums) {
        // int negative=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0) return 0;
        //     else if(nums[i]<0) negative++;
        // }
        // if(negative%2==0) return 1;
        // else return -1;

        int negative = 0;
        for (int n : nums) {
            if (n == 0) return 0;
            if (n < 0) negative++;
        }
        return negative % 2 == 0 ? 1 : -1;
    }
}