import java.util.*;

public class stockbuysell {
  
    
    class Solution {
        public int maxProfit(int[] prices) {
            
            int maxpro=0;
            
            int j=Integer.MAX_VALUE;
            
            for(int i=0;i<prices.length;i++)
            {
                if(prices[i]<j)
                {
                    j=prices[i];
                }
                
                maxpro= Math.max(prices[i]-j,maxpro);
            }
            
            return maxpro;
            
        }
    }
}
