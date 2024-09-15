class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int c=0;
        int indexel1=-1;
        int indexele2=-1;
        int n=nums1.length;
        int m=nums2.length;
        int total=(n+m);
        int i1=total/2;
        int i2=i1-1;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                if(c==i1) indexel1=nums1[i];
                if(c==i2) indexele2=nums1[i];
                i++;
                c++;
            }
            else{
                if(c==i1) indexel1=nums2[j];
                if(c==i2) indexele2=nums2[j];
                j++;
                c++;
            }
        }
        while(i<n){
            
                if(c==i1) indexel1=nums1[i];
                if(c==i2) indexele2=nums1[i];
                i++;
                c++;
            
        }
        while(j<m){
            
                if(c==i1) indexel1=nums2[j];
                if(c==i2) indexele2=nums2[j];
                j++;
                c++;
            
        }
        if(total%2==1){
            return indexel1;
        }
        return (double)((indexel1+indexele2)/2.0);
    }
}