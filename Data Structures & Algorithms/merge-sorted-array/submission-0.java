class Solution {
    private void reverseSubArray(int[] nums,int i,int j)
    {
        while(i<j)
        {
            nums[i]=nums[i]^nums[j];
            nums[j]=nums[i]^nums[j];
            nums[i]=nums[i]^nums[j];
            i++;
            j--;
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=m,mod=m+n;
        while(i<m && j<n)
        {
            if(nums1[i]<nums2[j])
            {
                nums1[k%mod]=nums1[i++];
            }
            else{
                nums1[k%mod]=nums2[j++];
            }
            k++;
        }
        while(i<m)
        {
            nums1[k%mod]=nums1[i++];
            k++;
        }
        while(j<n)
        {
            nums1[k%mod]=nums2[j++];
            k++;
        }
        reverseSubArray(nums1,0,m-1);
        reverseSubArray(nums1,m,n+m-1);
        reverseSubArray(nums1,0,n+m-1);
    }
}