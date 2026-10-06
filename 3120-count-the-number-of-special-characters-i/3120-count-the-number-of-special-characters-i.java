class Solution {
    public int numberOfSpecialChars(String word) {
        char[] letters=word.toCharArray();
        HashSet<Character>set=new HashSet<>();
        int count=0;
        for(char x:letters){
            set.add(x);
        }
        for(char x:set){
            if(Character.isLowerCase(x)){
                if(set.contains((char)((int)x-32))){
                    count++;
                }
            }
        }
        return count;
    }
}