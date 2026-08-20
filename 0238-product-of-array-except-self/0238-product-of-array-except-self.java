class Solution {
    public int[] productExceptSelf(int[] a) {
        int res[]=new int[a.length];
        int n=a.length;
        int total_zeroes=0;
        for(int i=0;i<n;i++){
            if(a[i]==0)total_zeroes++;
        }
        if(total_zeroes>1)return res;
        int product=1;
        for(int i=0;i<n;i++){
            if(a[i]!=0)
            product*=a[i];
        }
        if(total_zeroes==1){
            for(int i=0;i<n;i++){
                if(a[i]==0)
                res[i]=product;
            }
        }else{
            for(int i=0;i<n;i++){
                res[i]=product/a[i];
            }
        }
        return res;
    }
}