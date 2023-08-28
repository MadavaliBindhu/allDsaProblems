class Linkedlist {
    //declaring node
    static Node previous = null;
    static Node current = null;
    static Node first = null;

    public static void insert(int data) {
        Node temp = new Node();
        temp.data = data;//adding data from the temp
        temp.next = null;
        //if queue is empty
        if (first == null) 
        {
             // if linkedlist is empty temp will be first
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
        
        //insert data first
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
        //insert data last
        if(previous != null && current == null) {
            previous.next = temp;

            temp = current;
            return ;
                }
        //insert data middle
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
        //delete first element
        if(previous == null && current != null)
        {
            first = current.next;
            current.next = null;
            current = null;
        }
        //delete middle and last element
        if(current != null && previous != null)
        {
            previous.next = current.next;
            current.next = null;
            current = null;
        }
    }
    public static void main(String[] args) {
        Linkedlist.insert(15);
        Linkedlist.insert(25);
        Linkedlist.insert(90);
        Linkedlist.insert(20);
         Linkedlist.insert(345);
         Linkedlist.insert(150);
         Linkedlist.remove(90);
         Linkedlist.remove(10);
        Linkedlist.display();
    }
}
//declaring class nodes
class Node 
{
    int data;
    Node next;
}
