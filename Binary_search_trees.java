
	public class main{
		public static void main(String[] args){
			Node root = new Node();
			root.data = 11;
			
			System.out.println(root.data);
			
			root.left = new Node();
			root.left.data = 9;
			
			System.out.println(root.left.data);
		
			root.right = new Node();
			root.right.data = 10;
			
			
		
			root.left.left  = new Node();
			root.left.left.data  = 7;
			
			System.out.println(root.left.left.data);
		
			root.left.right = new Node();
			root.left.right.data  = 8;
		
			System.out.println(root.left.right.data);
		
			root.right.left  = new Node();
			root.right.left.data = 5;
			
			System.out.println(root.right.left.data);
		
			root.right.right = new Node();
			root.right.right.data  = 6;	
			
			System.out.println(root.right.right.data);
			
			System.out.print("dvckh8888888888888");
			inOrder(root);
			
			System.out.print("dvckh8888888888888");
			preOrder(root);
			
			System.out.print("dvckh8888888888888");
			root=insert(20,root);
			root=insert(100,root);
			inOrder(root);
			System.out.println("ddddddddddddddddddd");
			root=delete(100,root);
			inOrder(root);
			
	}
	public static void inOrder(Node root){
		if(root == null){
			return;
		}
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
	}
	public static void preOrder(Node root){
		if(root == null){
			return;
		}
			System.out.println(root.data);
			preOrder(root.left);
			preOrder(root.right);
	}
	public static Node insert(int data, Node root){
		if(root == null) {
			root = new Node();
			root.data = data;
			return root;
		}
		if(data< root.data) {
			root.left = insert(data,root.left);
		}
		else if(data>= root.data) {
			root.right = insert(data,root.right);
		}
		return root;
	}
	
	public static Node delete(int data, Node root){
		if(root == null) {
			
			return root;
		}
		if(data< root.data) {
			root.left = delete(data,root.left);
		}
		if(data> root.data) {
			root.right = delete(data,root.right);
		}
		else {
			if(root.left == null) {
				return root.right;
			}
			if(root.right == null){
				return root.left;
			}
		
			Node successorParent = root;
			Node successor = root.right;
			while(successor.left != null) {
				successorParent = successor;
				successor = successor.left;
			}
			if(successorParent != root){
				successorParent.left = successor.right;
			}
			else{
				successorParent.right = successor.right;
			}
			root.data = successor.data;
		}
		return root;
	}
}
class Node{
	int data;
	Node right;
	Node left;
}
