class Solution {
    public int[] twoSum(int[] num, int target) {
        // int arr[]=new int[2];
        // for(int i=0;i<num.length;i++){
        //     for(int j=i+1;j<num.length;j++){
        //         if(num[i]+num[j]==target){
        //             arr[0]=i+1;
        //             arr[1]=j+1;
        //         }
        //     }
        // }
        // return arr;

        //int arr[]=new int[2];
        int lt=0;
        int rt=num.length-1;
        while(lt<rt){
            int sum=num[lt]+num[rt];
            if(sum==target){
                return new int[]{lt+1,rt+1};
            }
            else if(sum>target){
                rt--;
            }
            else if(sum<target){
                lt++;
            }
        }
        return new int[]{-1,-1};
    }
}