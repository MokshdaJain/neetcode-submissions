class Solution {
    public int maxProduct(int[] nums) {
        if (nums==null || nums.length==0){ return 0;}
        int currmax=nums[0];
        int currmin=nums[0];
        int res= currmax;
        for(int i=1;i<nums.length;i++ ){
            int old= currmax;
            
            currmax=Math.max(nums[i],Math.max(currmax*nums[i],currmin*nums[i]));
            currmin=Math.min(nums[i],Math.min(old*nums[i],currmin*nums[i]));
            res=Math.max(res,currmax);
        }
        return res;
    }
}
