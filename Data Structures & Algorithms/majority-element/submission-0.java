class Solution {
    public int majorityElement(int[] nums) {
        int cur=nums[0],freq=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==cur) freq++;
            else freq--;
            if(freq==0){
                cur=nums[i];
                freq=1;
            }
        }
        return cur;
    }
}