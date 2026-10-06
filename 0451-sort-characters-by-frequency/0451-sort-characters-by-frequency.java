class Solution {
    public String frequencySort(String s) {
    Map<Character,Integer>map=new HashMap<>();
        for(char x : s.toCharArray())
        map.put(x, map.getOrDefault(x, 0) + 1);
      String result="";
      //First Method
    //   while(!map.isEmpty()){
    //   char maxchar=0;
    //   int maxfreq=Integer.MIN_VALUE;
    //   for(char x:map.keySet()){
    //       int freq=map.get(x);
    //       if(freq>maxfreq){
    //           maxfreq=freq;
    //           maxchar=x;
    //       }
    //   }
    //     for(int y=0;y<maxfreq;y++){
    //         result+=maxchar;
    //       }
    //       map.remove(maxchar);
    //   }
    List<Character>list=new ArrayList<>(map.keySet());
    list.sort((a,b) -> map.get(b)-map.get(a));
    for(char x:list){
        for(int i=0;i<map.get(x);i++){
            result+=x;
        }
    }
      return result;
    }
}