class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0)
        {
            return 0;
        }
        
//         Arrays.sort(nums);
        
//         int prev=nums[0];
//         int longsub=1;
//         int ans=1;
//         // as each element in itself is a sub sequence both for longsub and ans.
        
//         for(int i=1;i<nums.length;i++){
            
//             if(nums[i] == prev+1)
//             {
//                 longsub+=1;
                
//             }
//             else if(nums[i]!= prev)
//             {
//                 longsub=1;
//             }
//             prev= nums[i];
//             ans= Math.max(ans, longsub);
            
//         } nlogn approach
        // o(n) approach 
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