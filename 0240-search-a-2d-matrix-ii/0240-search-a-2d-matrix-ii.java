class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        
        int col=mat[0].length-1;
        int row=0;
        while(col>=0 && row<=mat.length-1){
            if(target==mat[row][col]){
                return true;
            }
            else if(target < mat[row][col]){
                col--;
            }
            else if(target> mat[row][col]){
                row++;
            }
        }
        return false;
    }
}