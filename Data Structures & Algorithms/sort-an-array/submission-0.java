class Solution {
    public int[] sortArray(int[] nums) {
        int[] arr=new int[100001];
        int diff=50000;
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]+diff]++;
        }
        for(int i=0,j=0;i<100001;i++)
        {
            while(arr[i]>0)
            {
                nums[j]=i-diff;
                j++;
                arr[i]--;
            }
        }
        return nums;
    }
}