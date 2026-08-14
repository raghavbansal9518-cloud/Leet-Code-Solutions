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

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>=target){
        //         return i;
        //     }
        // }
        // return nums.length;

        int start=0;
        int end=nums.length-1;
        int ans=nums.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>=target){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}