class Solution {
    public int removeElement(int[] nums, int val) {
        int prev=0,next=0;
        int n=nums.length;
        int k=0;
        while(next<n)
        {
            if(nums[next]!=val)
            {
                nums[prev]=nums[next];
                prev++;
                k++;
            }
            next++;
        }
        return k;
    }
}


