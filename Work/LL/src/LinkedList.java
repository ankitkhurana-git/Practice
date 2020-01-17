
public class LinkedList {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	void checkLoop(Node node) {
		if (node == null || node.next == null) {
			System.out.println("empty");
		}
		Node fast = node;
		Node slow = node;

		fast = node.next.next;
		slow = node.next;

		while (fast != null || fast.next != null) {
			if (slow == fast) {
				System.out.println("loop exists");
			}
			fast = node.next.next;
			slow = node.next;
		}
	}
}
