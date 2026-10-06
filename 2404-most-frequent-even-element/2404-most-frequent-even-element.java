class Solution {
    public int mostFrequentEven(int[] nums) {
    Map<Integer,Integer>map=new HashMap<>();
      for(int x:nums){
        if(x%2==0){
          if(map.containsKey(x)){
              map.put(x,map.get(x)+1);
          }
          else{
              map.put(x,1);
          }
      }
      }
      int maxfreq=Integer.MIN_VALUE;
      int answer=Integer.MAX_VALUE;
      for(int x:map.keySet()){
          int freq=map.get(x);
          if(freq>maxfreq){
              maxfreq=freq;
              answer=x;
          }
          else if(freq==maxfreq && x<answer){
               answer=x;
          }
      }
      if(answer==Integer.MAX_VALUE)return -1;
      return answer;
    }
}