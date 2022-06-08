import java.util.*;

class Kadanesalgo {
    public int maxSubArray(int[] nums) {
     
        int s=0;
        int e=0;
        int maxsum=0;
        int msf=nums[0];
        
        for(int i=0;i<nums.length;i++)
        {
            maxsum+=nums[i];
             if(maxsum>= msf)
            {
                msf= maxsum;
                e=i;
            }
            
            
            if(maxsum<0){
                maxsum=0;
                s=i+1;
            }
            
            
            }
        return msf;
        }
    }
