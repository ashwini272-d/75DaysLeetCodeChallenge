class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int[] res=new int[k];
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        ArrayList<Integer> list=new ArrayList<>(freq.keySet());
        Collections.sort(list, (a, b) -> freq.get(b) - freq.get(a));
        for(int i=0;i<k;i++){
            res[i]=list.get(i);
        }
        return res;
    }
}