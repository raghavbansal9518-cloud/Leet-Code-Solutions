class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
        // Method 1
        // return (s+s).contains(goal);

        //Method 2
        Queue<Character>q1=new LinkedList<>();
        Queue<Character>q2=new LinkedList<>();
        for(int i=0;i<s.length();i++)q1.add(s.charAt(i));
        for(int i=0;i<goal.length();i++)q2.add(goal.charAt(i));
        if(q1.equals(q2))return true;
        int n=q1.size();
        while(n-- >0){
            q1.add(q1.remove()); // poll is safe though
            if(q1.equals(q2))return true;
        }
        return false;
    }
}