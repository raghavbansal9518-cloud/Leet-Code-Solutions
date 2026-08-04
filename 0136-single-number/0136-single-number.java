class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            boolean output=true;
            for(int j=0;j<nums.length;j++){
            if(i!=j&&nums[i]==nums[j]){
                output=false;
                break;
            }
        }
        if(output){
            return nums[i];
        }
        }
        return -1;
    }
}