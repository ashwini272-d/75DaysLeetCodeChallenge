class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Arrays.stream(piles).max().getAsInt();
        int low=1;
        int high=max;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            long totalH=calculateHr(piles,mid);
            if(totalH<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public long calculateHr(int[] piles,int speed){
        long totalHr=0;
        for(int i : piles){
            totalHr+=(int)Math.ceil((double)i/speed);
        }
        return totalHr;
    }
}