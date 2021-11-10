class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=m+n-1;
        int i=nums1.length-nums2.length-1;
        int j=nums2.length - 1;
        while(k>=0 && i>=0 && j>=0)
        {
            if(nums1[i]>=nums2[j])
            {
                nums1[k--]=nums1[i];
                // System.out.println("added:"+nums1[i]);
                // k--;
                i--;
            }
            else{
                nums1[k--]=nums2[j];
                // System.out.println("added:"+nums2[j]);
                // k--;
                j--;
            }
            if(j<0){
                while(i>=0 && k>=0){
                    // System.out.println("added:"+nums1[i]);
                    nums1[k--]=nums1[i--];
                }
            }
            if(i<0){
                while(j>=0 && k>=0){
                    // System.out.println("added:"+nums2[j]);
                    nums1[k--]=nums2[j--];
                }
            }
        }
        if(m==0){
            while(j>=0 && k>=0){
                // System.out.println("added:"+nums2[j]);
                nums1[k--]=nums2[j--];
            }
        }
    }
}