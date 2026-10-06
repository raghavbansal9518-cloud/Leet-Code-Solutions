class Solution {
    public String frequencySort(String s) {
    Map<Character,Integer>map=new HashMap<>();
      for(char x:s.toCharArray()){
          if(map.containsKey(x)){
              map.put(x,map.get(x)+1);
          }
          else{
              map.put(x,1);
          }
      }
      String result="";
      while(!map.isEmpty()){
      char maxchar=0;
      int maxfreq=Integer.MIN_VALUE;
      for(char x:map.keySet()){
          int freq=map.get(x);
          if(freq>maxfreq){
              maxfreq=freq;
              maxchar=x;
          }
      }
        for(int y=0;y<maxfreq;y++){
            result+=maxchar;
          }
          map.remove(maxchar);
      }
      return result;
    }
}