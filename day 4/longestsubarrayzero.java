lass GfG
{
    int maxLen(int A[], int n)
    {
        // Your code here
          HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int max = 0;
        int sum = 0; 

        for(int i = 0;i<n;i++) {

            sum += A[i]; 

            if(sum == 0) {
                max = i + 1; 
            }
            else {
                if(map.get(sum) != null) {

                    max = Math.max(max, i - map.get(sum)); 
                }
                else {

                    map.put(sum, i); 
                }
            }
        }
        return max; 
        
        
    }
}