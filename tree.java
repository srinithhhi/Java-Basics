class Node
{
    public int data;
    public Node left;
    public Node right;
    
    Node(int data)
    {
        this.data= data;
        this.left=null;
        this.right=null;
    }
}

class Tree{
    public Node root = null;
    void insert(int data)
    {
        Node n= new Node(data);
        if(root==null)
        {
            root =n;
        }
        else
        {
           Node temp=root;
           while(true)
           {
               if (temp.data>data)
               {
                   if (temp.left==null)
                   {
                       temp.left=n;
                       break;
                   }
                   else
                   {
                       temp=temp.left;
                   }
               }
               else{
                   if(temp.right==null)
                   {
                       temp.right=n;
                       break;
                   }
                   else
                   {
                       temp=temp.right;
                   }
               }
           }
        }
    }
    void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
}
   
public class Main
{
	public static void main(String[] args) {
	    Tree t= new Tree();
	    t.insert(100);
	    t.insert(10);
	    t.insert(90);
	    t.insert(70);
	    t.insert(80);
	    t.insert(30);
	    t.insert(35);
	    t.insert(120);
	    t.insert(11);
	    t.insert(22);
	    //methods
	    t.inorder(t.root);
	    //t.preorder();
	    //t.postorder();
	}
}
