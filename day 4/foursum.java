class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        ArrayList<List<Integer>> ans= new ArrayList<List<Integer>>();
        
        if(nums.length== 0|| nums==null)
        {
            return ans;
        }
  
        int i,j;
        int n= nums.length;
        Arrays.sort(nums);
        
        for( i=0;i<n;i++)
        {
            long t3= target-nums[i];
            
            
            
            for( j=i+1;j<n;j++)
            {
                long t2= t3-nums[j];
            
            
                int front=j+1;
                int back= n-1;
                while(front<back)
                {
                    long twosum= nums[front]+ nums[back];
                    
                    if(twosum <t2){
                        front++;
                    }
                    else if(twosum > t2)
                    {
                        back--;
                    }
                    
                    else{
                        List<Integer> quad= new ArrayList<Integer> ();
                        
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[front]);
                        quad.add(nums[back]);
                        
                        ans.add(quad);
                        
                        while(front < back && nums[front]== quad.get(2))
                        {
                            ++front;
                        }   
                        while(front < back && nums[back]== quad.get(3))
                        {
                            --back;
                        }
                        
                    }
                }
                
                while(j+1 <n && nums[j+1]==nums[j]){
                    ++j;
                }
            }
            
             while(i+1 <n && nums[i+1]==nums[i]){
                    ++i;
                }
        }
        
        return ans;
        
    }
}