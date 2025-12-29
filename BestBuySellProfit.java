class Solution {
    public int maxProfit(int[] prices) {

        //optimized
        int l=0, r=1, maxProfit=0;
        while(r<prices.length){
            if (prices[l]<prices[r]){
                maxProfit = Math.max(maxProfit, prices[r]-prices[l]);
            }else{
                l=r;
            }
            r++;
        }
        return maxProfit;
        
        // //brute force
        // int cnt=0;
        // int maxProfit = 0;
        // for(int price:prices){
        //     for(int j=cnt+1;j<prices.length;j++){
        //         int diff=prices[j]-price;
        //         if (maxProfit < diff){
        //             maxProfit = diff;
        //         }
        //     }
        //     cnt++;
        // }
        // return maxProfit;
        
    }
}
