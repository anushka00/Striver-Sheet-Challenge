import java.util.*;
class rotate {
    public void rotate(int[][] matrix) {
           for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            // for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
            int k=0;
            int j=matrix[0].length-1;
            while(k<=j){
                temp = matrix[i][k];
                matrix[i][k] = matrix[i][j];
                matrix[i][j] = temp;
                k++;
                j--;
            }
        }
    
    }
}