import java.util.*;
public class repeatmissing {
 

        public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
            
            ArrayList<Integer> ans= new ArrayList<>();
            int missing;
            int repeating;
            
            int size= A.size();
            
            int slow=A.get(0);
            int fast=A.get(0);
            
            do{
                
                slow= A.get(slow);
                fast=A.get(A.get(fast));
                
            }while(slow!=fast);
            
            fast=A.get(0);
            
            while(slow!=fast)
           {
               slow=A.get(slow);
               fast=A.get(fast);
           }
           
           repeating=slow;
           
           int sum=0;
           
          for(int i=0;i<size;i++)
          {
              sum= sum+ A.get(i);
          }
           
           int totsum=size*(size+1)/2;
           
           missing= totsum- (sum-repeating);
            
            
            ans.add(repeating);
            ans.add(missing);
            
            return ans;
            
        }
    }
}
