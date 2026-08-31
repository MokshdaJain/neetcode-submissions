class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int zerocount=0;
      for(int i:nums){
        if(i!=0){
            product*=i;
        }
        else{
            zerocount++;
        }
      }
      
      int[] result= new int[nums.length];
      if(zerocount>1){
        return result;
      }
      if(zerocount==1){
        for(int i=0;i<nums.length;i++){
             if (nums[i] == 0) {
                    result[i] = product;
                }
            }
            return result;
        }
      for (int i = 0; i < nums.length; i++){
        if(zerocount==0){
            result[i]=product/nums[i];
        }
      }
      return result;
    }
 }