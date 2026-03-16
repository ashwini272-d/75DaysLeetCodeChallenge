class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map=new HashMap<>();
       for(String str: strs){
        String s=str;
        char[] tempArray=s.toCharArray();
        Arrays.sort(tempArray);
        String sorted=new String(tempArray);
        if(!map.containsKey(sorted)){
            map.put(sorted,new ArrayList<>());
        }

        map.get(sorted).add(str);
       }

        List<List<String>> ans=new ArrayList<>(map.values());
        return ans;
    }
}