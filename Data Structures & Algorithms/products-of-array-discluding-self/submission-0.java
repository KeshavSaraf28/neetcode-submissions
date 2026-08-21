class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n],suffix=new int[n],result=new int[n];
        for(int i=0;i<n;i++)
        {
            int prev=i>0?prefix[i-1]:1;
            prefix[i]=prev*nums[i];
            int next=n-i<n?suffix[n-i]:1;
            suffix[n-i-1]=next*nums[n-i-1];
        }
        for(int i=0;i<n;i++)
        {
            int prev=i>0?prefix[i-1]:1;
            int next=i<n-1?suffix[i+1]:1;
            result[i]=prev*next;
        }
        return result;
        
    }
}  
