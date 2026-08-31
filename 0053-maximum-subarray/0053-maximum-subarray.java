class Solution {
    public int maxSubArray(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        int cSum=list.get(0);
        int mSum=list.get(0);
        for(int i=1;i<list.size();i++){
            int x=list.get(i);
            cSum=Math.max(x,cSum+x);
            mSum=Math.max(mSum,cSum);
        }
        return mSum;
    }
}