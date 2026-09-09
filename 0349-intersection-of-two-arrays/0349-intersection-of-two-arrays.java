class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> set1=new HashSet<>();
        for(int x:nums1){
            set.add(x);
        }
        for(int y:nums2){
        if(set.contains(y)){
            set1.add(y);
        }
        }
        int[] nums3=new int[set1.size()];
        int k=0;
        for(int z:set1){
            nums3[k++]=z;
        }
        return nums3;
    }
}