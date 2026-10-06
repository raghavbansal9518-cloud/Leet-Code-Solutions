class Solution {
    public int minElement(int[] nums) {
        int n[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]>0){
                sum+=nums[i]%10;
                nums[i]/=10;
            }
            n[i]=sum;
        }
        int min=n[0];
        for(int x:n){
            if(x<min){
                min=x;
            }
        }
        return min;
    }
}