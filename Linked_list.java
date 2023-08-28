public class Linked_list {
	static Node previous = null;
	static Node current = null;
	static Node first = null;

public static void insert(int data) {
	Node temp = new Node();
	temp.data = data;
	temp.next = null;

		if (first == null) {

			first = temp;
			return;
		}
	 	else {
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
		if(previous != null && current == null) {
			previous.next = temp;

			temp = current;
			return ;
                }
		if(previous == null && current != null) {
			temp.next = current;
			current = temp;
			return ;
		}
		if(previous != null && current != null)
		{
			previous.next = temp;
			temp.next = current;
			return;
		}
		}
			
	static void delete_first(){
		if(first==null)
		{
		    return;
		}
		  Node temp=first;							
		  first=first.next;    																				
		  temp.next=null;
		  temp=null;
	}
	
	public static void delete_last() {
		if(previous==null){
			return;
		}
			Node temp=previous;
			previous=previous.next;
			temp.next=null;
			temp=null;
		}
		
	public static void delete_middle() {
		if(current == null){
			return;
		}
		Node temp = current;
		current = current.next;
		temp.next = null;
		temp = null;
	}
	
	public static void display() {
		Node tempe = first;
		while (tempe != null) {
			System.out.println(tempe.data);
			tempe = tempe.next;
		}
	}

	public static void main(String[] args) {
		insert(10
		);
		insert(90);
		insert(25);
 		insert(34);
 		insert(50);
 		insert(15);
 		insert(13);
 		insert(12);
 		delete_first();
 		delete_first();
		display();
	}
	static class Node {
		int data;
		Node next;
	}
}


