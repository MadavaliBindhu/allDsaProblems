
public class LINKEDLIST
{
    static Node previous = null;
    static Node current = null;
    static Node first = null;

    public static void insert ( int data )
    {
        Node temp = new Node();
        temp.data = data;
        temp.next = null;

        if( first == null )
        {
            first = temp;
            return;
        }
        else{
            current = first;
            while ( current != null && current.data < temp.data )
            {
                 previous = current;
                 current = current.next;
            }
         }

         //insert first

        if( current == null && previous == null && first != null )
        {
             temp.next = first;
             first = temp;
             return;
        }

         if( current != null && previous == null )
         {
            temp.next = current;
            first =temp;
         }

         //insert middle

        if( previous != null && current != null )
        {
            previous.next = temp;
            temp.next = current;
            return;
         }

         //insert end

         if( current == null && previous != null )
         {
             previous.next = temp;
             temp = current;
             return;
         }
    }



    // remove function
     public static void remove(int data) {
         previous = null;
         current = first;

     // traverse until you find data
         while (current != null && current.data != data)
         {
             previous = current;
             current = current.next;
         }

         if (current == null && previous == null)
         {
             System.out.println("no nodes");
             return;
         }

         if (previous != null && current == null)
         {
             System.out.println("not found");
             return;
         }

     // node to be deleted is the first node
         if(previous == null && current != null)
         {
             first = current.next;
             current.next = null;
             current = null;
         }

    // node to be deleted is the middle or last node
         if (previous != null && current != null)
         {
             previous.next = current.next;
             current.next = null;
             current = null;
         }

     }
     
     public static Node reverse(Node first)
     {
         if (first == null || first.next == null) 
         {
            return first;
         }

         Node previous = first;
         Node current = previous.next;
         previous.next=null;
         
         while (current != null)
         {
             Node temp = current;
             current = current.next;
             temp.next = previous;
             previous = temp;
        }

         return previous;
     }



    public static void display()
    {
        Node traverse = first;
        while ( traverse != null )
        {
             System.out.println( traverse.data );
             traverse = traverse.next;
        }
    }

    public static void main ( String[] args)
    {
        for(int i=1;i<=20;i++)
        {
            LINKEDLIST.insert(i);
        }
        
        /*LINKEDLIST.insert();
        
        LINKEDLIST.insert(2);
        LINKEDLIST.insert(3);
        LINKEDLIST.insert(5);
        LINKEDLIST.insert(9);
        LINKEDLIST .insert(10);
         LINKEDLIST.insert(8);*/
     
     
         LINKEDLIST.remove(8);
     
         first=LINKEDLIST.reverse(first);
        LINKEDLIST.display();
    }
    class Node
	{
	int data;
	Node next;
	}

}
