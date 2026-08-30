class Solution {
    public int maxSubArray(int[] nums) {
        int currSum=0;
        int maxSum=nums[0];
        for(int i:nums){
            currSum=Math.max(i,currSum + i);
            maxSum=Math.max(maxSum,currSum);
        }
        return maxSum;
    }
}
