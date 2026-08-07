class Solution {
    public int splitArray(int[] nums, int k) {
        int low=Arrays.stream(nums).max().getAsInt();
        int high=Arrays.stream(nums).sum();
        int res=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(mid,nums,k)){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
    public boolean isPossible(int barrier, int[] nums, int k){
        int target=1; int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>barrier) return false;
            if(nums[i]+sum>barrier){
                target+=1;
                sum=nums[i];
            }
            else{
                sum+=nums[i];
            }
        }
        if(target>k){
            return false;
        }
        else{
            return true;
        }
    }
}