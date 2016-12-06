package recursion;

public class Enlazada {

	public static void main(String[] args) {
		Node n1 = new Node();
		n1.value = 1;
		n1.next = new Node(2);
		n1.next.next = new Node(3);
		n1.next.next.next = new Node(4);
		
		Node temp = n1;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
		System.out.println("Is temp null? " + (temp == null));
		
		System.out.println("--------------------------------");
		
		Node n2 = new Node(3);
		
		Node temp2 = n2;
		for (int i = 0; i < 10; i++) {
			temp2.next = new Node(i);
			temp2 = temp2.next;
		}
		
		temp2 = n2;
		while (temp2 != null) {
			System.out.println(temp2.value);
			temp2 = temp2.next;
		}
	}

}

class Node {
	int value;
	Node next;

	public Node() {
		super();
	}
	
	public Node(int value, Node next) {
		super();
		this.value = value;
		this.next = next;
	}
	
	public Node(int value) {
		super();
		this.value = value;
	}
}
