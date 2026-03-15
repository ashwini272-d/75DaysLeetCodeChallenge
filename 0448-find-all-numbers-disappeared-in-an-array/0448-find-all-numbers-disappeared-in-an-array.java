class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        for(int i=1;i<=n;i++){
            if(!map.containsKey(i)){
                list.add(i);
            }
        }
        return list;
    }
}