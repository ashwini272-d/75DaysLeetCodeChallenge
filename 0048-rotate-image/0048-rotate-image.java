class Solution {
    public void rotate(int[][] mat) {
        int n=mat.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            reverse(mat[i],0,n-1);
        }
    }
    public void reverse(int[] mat,int left,int right){
        while(left<=right){
            int temp=mat[left];
            mat[left]=mat[right];
            mat[right]=temp;
            left++;
            right--;
        }
    }
}