class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> list=new ArrayList<>();
        int start=0;
        int maxlen=0;
        for(int end=0;end<s.length();end++){
            char current=s.charAt(end);
            while(list.contains(current)){
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
            list.add(current);
            maxlen=Math.max(maxlen,end-start+1);
        }
        return maxlen;
    }
}