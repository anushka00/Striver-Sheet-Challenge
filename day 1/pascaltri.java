import java.util.* ;
 
// import java.util.ArrayList;

public class pascaltri {

        public List<List<Integer>> generate(int numRows) {

                List<List<Integer>>al= new ArrayList<>();
                List<Integer> ral= null;
                List<Integer> pre=null;
    
               
            for(int i=0;i<numRows;i++)
            {  
                ral= new ArrayList<>();
                for(int j=0;j<=i;j++)
                {
                    if(j==0 || j==i)
                    {
                        ral.add(1);
                    }
                    else{
                        ral.add(pre.get(j-1)+ pre.get(j));
                    }
                    
                    
                    
                }
                pre=ral;
                al.add(ral);
            }
           
           return al;
        }
    }
    

