class Linkedlist{
    Node head;
    class Node
    {
        int data;
        Node next;
        
        Node( int val)
        {
            data= val;
            next= null;
        }
    }
    
    Linkedlist()
    {
        head= null;
    }
    
    void insert(int val)
    {
        Node newNode= new Node(val);
        if( head == null)
        {
            head= newNode;
            return;
        }
        else
        {
            newNode.next= head;
            head= newNode ;
        }
    }
    
    void display()
    {
        Node temp= head;
        
        while (temp!= null)
        {
            System.out.print(temp.data + " ");
            temp= temp.next;
        }
    }
    
    void insertpos(int p, int val)
    {
        Node newNode= new Node(val);
        if(p == 0)
        {
            insert(val);
            return;
        }
        else
        {
            Node temp=head;
            for (int i=0;i<p ;i++ )
            {
                if(temp==null)
                {
                    System.out.println("insertion not possible");
                    return;
                }
                temp=temp.next;
            }
            newNode.next= temp.next;
            temp.next=newNode;
            
            
        }
    }
    
    void delete(int p)
    {
        Node temp=head;
        for (int i=1;i<p-1 ;i++) 
        {
            temp=temp.next;
            
        }
        temp.next=temp.next.next;
    }
}

public class Main
{
	public static void main(String[] args) {
	    Linkedlist l= new Linkedlist();
	    l.insert(100);
	    l.insert(200);
	    l.insert(300);
	    l.insert(400);
	    //l.display();
	    //l.insertpos(12,500);
	    //l.display();
	    l.delete(2);
	    l.display();
	}
}


