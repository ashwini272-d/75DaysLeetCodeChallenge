class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=Arrays.stream(weights).max().getAsInt();
        int high=Arrays.stream(weights).sum();
        while(low<=high){
            int mid=low+(high-low)/2;
            int ans=noOfDays(weights,mid);
            if(ans<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public int noOfDays(int[]weights,int cap){
        int day=1;int load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>cap){
                day=day+1;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return day;
    }
}