class Solution {
    public boolean containsDuplicate(int[] nums) {
    //    Set<Integer> set=new HashSet<>();
    //    for(int k=0;k<nums.length;k++){
    //     set.add(nums[k]);
    //    }
    //    if(nums.length==set.size())return false;
    //    return true;

    Set<Integer> set=new HashSet<>();
    for(int x:nums)set.add(x);
    return set.size()==nums.length?false:true;

    }
}