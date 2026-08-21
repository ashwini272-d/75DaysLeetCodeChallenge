class Solution {
    public int[] resultArray(int[] nums) {
        int[] a=new int[nums.length];
        int[] b=new int[nums.length];
        a[0]=nums[0];
        b[0]=nums[1];
        int size1=1;
        int size2=1;
        for(int i=2;i<nums.length;i++){
            if(a[size1-1] > b[size2-1]){
                a[size1++]=nums[i];
            }
            else {
                b[size2++]=nums[i];
            }
        }
        int ans[]=new int [nums.length];
        System.arraycopy(a,0,ans,0,size1);
        System.arraycopy(b,0,ans,size1,size2);
        return ans;
    }
}