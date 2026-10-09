class Solution {
    public int findFinalValue(int[] nums, int original) {
        Deque<Integer>deq=new ArrayDeque<>();
        for(int x:nums){
            deq.addLast(x);
        }
        while(deq.contains(original)){
            original=original*2;
        }
        return original;
    }
}