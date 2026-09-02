public class Solution {
    public int maxProfit(int[] prices) {
        int min=4234234;
        int profit=0;
int max=0;
        for(int i=0;i< prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
                max=0;
            }
            else {
               profit=Math.max(profit,prices[i]-min);
               profit=Math.max(profit,max-min);
            }
        }
        return profit;
    
}
}