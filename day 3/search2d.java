
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row= matrix.length;
        int col= matrix[0].length;
        int low=0;
        int hi= (row*col)-1;
        
        while(low<=hi){
            int mid= low +(hi-low)/2;
            
            if(matrix[mid/col][mid%col]==target)
            {
                return true;
            }
           else if(matrix[mid/col][mid%col]<target){
               low=mid+1;
           }
          else{
              hi= mid-1;
          }
        }
        
        return false;
    }
}