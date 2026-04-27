class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list=new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int n=list.size();
        int k=0;
        int[] res=new int[n];
        for(int x : list){
            res[k++]=x;
        }
        return res;
    }
}