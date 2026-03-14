class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set=new HashSet<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i : nums1){
            set.add(i);
        }
        for(int num : set){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        set.clear();
        for(int i : nums2){
            set.add(i);
        }
        for(int num : set){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        set.clear();
        for(int i : nums3){
            set.add(i);
        }
        for(int num : set){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        List<Integer> res = new ArrayList<>();

        for(int e : map.keySet()){
            if(map.get(e) >= 2){
                res.add(e);
            }
        }
        return res;
    }
}