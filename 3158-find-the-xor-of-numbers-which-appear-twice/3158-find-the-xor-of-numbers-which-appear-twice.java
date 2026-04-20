class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                ans^=nums[i];
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}