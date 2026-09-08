class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer>list=new ArrayList<>();
        for(Integer i:nums){
            if(!list.contains(i))list.add(i);
        }
        int k=0;
        for(Integer i:list){
            nums[k++]=i;
        }
        return k;
    }
}