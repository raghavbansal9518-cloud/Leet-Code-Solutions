class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                return nums[i];
            }
        }
        return -1;

        // int num=0;
        // int[] arr  = new int[Integer.MAX_VALUE];
        // for(int i=0; i<nums.length;i++){
        //     arr[nums[i]]++;
        //     if(arr[nums[i]]==1){
        //         num = nums[i];
        //     }
        // }
        // return num;
    }
}