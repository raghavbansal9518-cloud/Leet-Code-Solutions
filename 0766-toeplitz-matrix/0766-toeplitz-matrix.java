class Solution {
    public boolean isToeplitzMatrix(int[][] m) {
        int row=m.length;
        int col=m[0].length;
        boolean equal=true;
        for(int i=0;i<row-1;i++){
            for(int j=0;j<col-1;j++){
                if(m[i][j]!=m[i+1][j+1]){
                    equal=false;
                    break;
                }
            }
            if(!equal)break;
        }
        return equal;
    }
}