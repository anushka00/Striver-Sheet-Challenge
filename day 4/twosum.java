class Solution {
    public int[] twoSum(int[] a, int target) {
        int [] ans= new int[2];
        
        int b[]=  a.clone();
 
        Arrays.sort(b);
        
        int i=0;
        int j=b.length-1;
       
        
        while(i<=j)
        {
            if(b[i]+b[j]==target)
            {
                break;
            }
            else if(b[i]+b[j]<target)
                
            {
                i++;
            }
            else{
                j--;
            }
        }
        
        int el1= b[i];
        int el2=b[j];
        
      int k=0;
        
        for(i=0;i<a.length;i++)
        {
           if(a[i]==el1 || a[i]==el2)
           {
               ans[k]= i;
               k++;
           }
        }
        
        return ans;
    }
}