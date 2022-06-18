import java.util.*;

class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0)
        {
            return 0;
        }
        

        HashSet<Integer> set= new HashSet<>();
           for(int num:arr)
        {
            set.add(num);
        }
        int longcount=0;
        
        for(int num:arr)
        {
            if( !set.contains(num-1))
            {
             int currentnum=num;
                int currentcount=1;
                
                while(set.contains(currentnum+1))
                {
                    currentcount+=1;
                    currentnum+=1;
                }
                longcount= Math.max(longcount, currentcount);
            }
            
        }
        
    return longcount; 
        
        
     
    }
}