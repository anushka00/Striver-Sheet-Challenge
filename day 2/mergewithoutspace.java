import java.util.*;

public class mergewithoutspace {
 
 
        public void merge(int[] nums1, int m, int[] nums2, int n) {
         
            
            if(m==0)
            {
                for(int i=0;i<nums1.length;i++)
                {
                    nums1[i]= nums2[i];
                }
                
                
            }
            
            else if(n==0)
            {
                return;
            }
            
            else {
                int i=0;
                int j=0;
                
                while(i<m )
                {
                    
                    if(nums2[j]< nums1[i])
                    {
                        int tmp=nums2[j];
                        nums2[j]=nums1[i];
                        nums1[i]=tmp;
                        Arrays.sort(nums2);
                    }
                        i++;
                   
                }
           
                
                if(j<n){
                    while(i<(m+n))
                    {
                        nums1[i]=nums2[j];
                        i++;
                        j++;
                    }
                }
            }
        }
    }
}
