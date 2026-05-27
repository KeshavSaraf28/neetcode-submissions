class Solution {
    public static void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        
        int i=0,j=1,k=nums.length-1;
        while(j<=k)
        {
            if(nums[j]==0)
            {
                swap(nums,i,j);
                if(i==j) j=i+1;
                i++;
            }
            else if(nums[j]==2)
            {
                swap(nums,j,k);
                k--;
            }
            else{
                j++;
            }
        }
        
    }
}