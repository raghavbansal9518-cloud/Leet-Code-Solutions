class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>set1=new HashSet<>();
        for(int x:nums1){
            set.add(x);
        }
        for(int x:nums2){
            set1.add(x);
        }
        set.retainAll(set1);
        if(set.isEmpty()) return -1;
        int min=Collections.min(set);
        return min;
    }
}