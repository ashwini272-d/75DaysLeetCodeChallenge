class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Arrays.stream(nums).max().getAsInt();
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(nums,mid,threshold)==true){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean possible(int[] nums, int val, int threshold){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(int)Math.ceil((double)nums[i]/val);
        }
        if(sum<=threshold)
            return true;
        return false;
    }
}