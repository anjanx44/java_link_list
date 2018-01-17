
public class LinkedList {
	static Node head;

	public static void main(String[] args) {
		head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		
		printList();

	}
	
	public static void printList(){
		Node n = head;
		
		while(n!=null){
			System.out.println(n.data+" ");
			n=n.next;
		}
		
	}

}
