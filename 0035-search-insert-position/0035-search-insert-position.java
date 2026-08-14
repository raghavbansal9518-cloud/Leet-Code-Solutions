class Solution {
    public int searchInsert(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         return i;
        //     }
        //     else{
        //         if(target!=0 && nums[i]==target-1){
        //             return i+1;
        //         }
        //         else if(target!=0 && nums[i]==target+1){
        //             return i-1;
        //         }
        //     }
        // }
        // return 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }
}