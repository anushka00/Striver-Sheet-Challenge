import java.util.*;
class mergeoverlapping{


public static void main(String[] args)
{
Scanner scn= new Scanner(System.in);
int n= scn.nextInt();
int [] a= new int[n];

for(int i=0;i<n;i++)
{
a[i]=scn.nextInt();
}


}
}
public class mergeoverlapping {
   
        public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
            Stack<Integer> st= new Stack<>();
            int start=intervals[0][0];
            int end= intervals[0][1];
             st.push(start);
            
            
            for(int i=1;i<intervals.length;i++)
            {   
                
                
                    if(intervals[i][0] > end)
                    {  
                        
                       st.push(end);
                        start=intervals[i][0];
                        end=intervals[i][1];
                        st.push(start);
                    }
                    
                    else if( intervals[i][0]<= end){
                        // if(intervals[i][1]<= end){
                        //     st.push(end);
                        // }
                      
                        if (intervals[i][1]> end) {
                            end= intervals[i][1];
                            
                        }
                     
                    }
                }
            
            st.push(end);
            int n= intervals.length;
            
            int size= st.size();
            int j=size/2;
            int [][]ans= new int[j][2];
            for(int i=j-1;i>=0;i--)
            
            {
                ans[i][1]=st.peek();
                st.pop();
                ans[i][0]=st.peek();
                st.pop();
                //st.pop does not return anything because pop is a void function
                
            }
            return ans;
        }
    }
}
