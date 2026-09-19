class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                ans[k]=nums1[i];
                i++; k++;
            }
            else if(nums1[i]>=nums2[j]){
                ans[k]=nums2[j];
                j++; k++;
            }
        }
        while(i<nums1.length){
            ans[k]=nums1[i];
            k++;
            i++;
        }
        while(j<nums2.length){
            ans[k]=nums2[j];
            j++;
            k++;
        }
        double res=0;
        int n=ans.length;
        if(n%2==0){
            res=((double)ans[n/2-1]+ans[n/2])/2.0;
        }
        else{
            res=ans[n/2];
        }
        return res;
    }
}