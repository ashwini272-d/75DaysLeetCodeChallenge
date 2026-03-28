class Solution {
    public int longestConsecutive(int[] nums) {
        int len=1;
        int n=nums.length;
        if(n==0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int it : set){
            if(!set.contains(it-1)){
                int count=1;
                int x=it;
                while(set.contains(x+1)){
                    x=x+1;
                    count+=1;
                }
                len=Math.max(len,count);
            }
        }
        return len;
    }
}