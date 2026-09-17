class Solution {

    public int pivotIndex(int[] nums) {
        int index = -1;
        for(int i = 0; i < nums.length; i++) {
            int suml = 0;
            int sumr = 0;
            for(int j = 0; j < nums.length; j++) {
                if(j < i) {
                    suml += nums[j];
                }
                else if(j > i) {
                    sumr += nums[j];
                }
            }
            if(suml == sumr) {
                return i;
            }
        }
        return index;
    }
}