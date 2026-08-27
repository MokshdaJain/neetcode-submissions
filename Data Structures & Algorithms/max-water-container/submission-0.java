class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int n= heights.length;
        int j=n-1;      
        int maxArea=0;
        while(i<j){
            int width=j-i;
            int area=width*Math.min(heights[i],heights[j]);
            maxArea=Math.max(maxArea, area);
            
            if(heights[i]>heights[j]){
                j--;
            }
            else if(heights[j]>heights[i]){
                i++;
            }
            else{
                i++;
                j--;
            }

        }
        return maxArea;
    }
}
