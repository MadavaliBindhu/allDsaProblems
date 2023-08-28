class Linked {
    
    static Node previous = null;
    static Node current = null;
    static Node first = null;

    public static void insert(int data) {
        Node temp = new Node();
        temp.data = data;/
        temp.next = null;
    
        if (first == null) 
        {
             
            first = temp;
            return;
        }
         else 
         {
            current = first;
            while (current != null && current.data < temp.data)
            {
                previous = current;
                current = current.next;
            }
        }
        
        
        if(current == null && previous == null && first != null) {
            temp.next = first;
            first = temp;
            return;
        }
        else if(previous == null && current != null) 
        {
            temp.next = current;
            current = temp;
            return;
        }
       
        if(previous != null && current == null) {
            previous.next = temp;

            temp = current;
            return ;
                }
       
        else if(previous != null && current != null)
        {
            previous.next = temp;
            temp.next = current;
            return;
        }
    }
    public static void display() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void remove(int data)
    {
        previous = null;
        current = first;
        
        while(current != null && current.data != data){
        
            previous = current ;
            current = current.next;
        }
        if(previous == null && current == null)
        {
            System.out.println("No nodes");
            return;
        }
        if(previous != null && current == null)
        {
            System.out.println("Not found");
            return;
        }
        
        if(previous == null && current != null)
        {
            first = current.next;
            current.next = null;
            current = null;
        }
     
        if(current != null && previous != null)
        {
            previous.next = current.next;
            current.next = null;
            current = null;
        }
    }
    public static void main(String[] args) {
        Linked.insert(15);
        Linked.insert(25);
        Linked.insert(90);
        Linked.insert(20);
         Linked.insert(345);
         Linked.insert(150);
         Linked.remove(90);
         Linked.remove(10);
        Linked.display();
    }
}

class Node 
{
    int data;
    Node next;
}
