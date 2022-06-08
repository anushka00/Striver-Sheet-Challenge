class Solution {
    public void sortColors(int[] nums) {
     int l=0;
        int h=nums.length-1;
        int mid=0;
        int tmp;
        while(mid<=h)
        {
            if(nums[mid]==0)

            {
               tmp= nums[l];
                nums[l]=nums[mid];
                nums[mid]=tmp;
                l++;
                
                mid++;
               
            }
                
           else  if(nums[mid]==1)
            {
                mid++;
              
            }

            // if(nums[mid]==2)
            else{
                tmp= nums[mid];
                nums[mid]=nums[h];
                nums[h]=tmp;
                h--;
            }
            
        }
        
       
    }
}

