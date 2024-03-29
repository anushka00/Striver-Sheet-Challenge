class GfG
{
    Node flatten(Node root)
    {
	// Your code here
	
	if(root==null || root.next==null)
	return root;
	
	root.next= flatten(root.next);
	
	root= mergelists(root,root.next);
	
	return root;
	
    }
    
    static Node mergelists(Node a, Node b)
    {
        Node tmp= new Node(0);
        Node res= tmp;
        
        
        while(a!=null && b!=null)
        {
            if(a.data< b.data)
            {
                tmp.bottom=a;
                tmp=tmp.bottom;
                a=a.bottom;
            }
            else{
                tmp.bottom=b;
                tmp=tmp.bottom;
                b=b.bottom;
            }
            
            
            
        }
        
        if(a!=null)
        {
            tmp.bottom=a;
        }
        else{
             tmp.bottom = b;
     
        }
        
           return res.bottom; 
        
    }
}

