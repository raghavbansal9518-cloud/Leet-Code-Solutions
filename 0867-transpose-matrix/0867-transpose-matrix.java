class Solution {
    public int[][] transpose(int[][] m) {
        int row=m.length;
        int col=m[0].length;
        int t[][]=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                t[j][i]=m[i][j];
            }
        }
        return t;
    }
}