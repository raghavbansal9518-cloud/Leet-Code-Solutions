class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        // Method 1
        // HashSet<Integer>set=new HashSet<>();
        // HashSet<Integer>set1=new HashSet<>();
        // for(int x:nums1){
        //     set.add(x);
        // }
        // for(int x:nums2){
        //     set1.add(x);
        // }
        // set.retainAll(set1);
        // if(set.isEmpty()) return -1;
        // int min=Collections.min(set);
        // return min;

        //Method 2
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return -1;
    }
}