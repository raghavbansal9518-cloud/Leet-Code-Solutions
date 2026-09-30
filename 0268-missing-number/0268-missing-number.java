class Solution {
    public int missingNumber(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            list.add(nums[i]);
        }
        int missing=-1;
        for(int i=0;i<=n;i++){
            if(!list.contains(i)){
                missing=i;
                break;
            }
        }
        return missing;
    }
}