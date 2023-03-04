package ch2_LinkedList;

public class Question2_3 {
	
	// method simulates the deletion of data at a particular node by copying data
	// from the next node over and then deleting that node
	// only works if node is not the last element of list (could be alleviated with a sentinel)
	private <T> void deleteNode(Node<T> x) throws Exception {
		if (x.next == null) {
			throw new Exception();
		}
		Node<T> temp = x.next;
		x.data = x.next.data;
		x.next = x.next.next;
		temp.next = null;
	}
	
	private void test() throws Exception {
		BasicLinkedList<Integer> input = new BasicLinkedList<>();
		input.append(1);
		input.append(2);
		input.append(3);
		input.append(4);
		input.append(5);
		input.append(6);
		input.append(7);
		input.append(8);
		Node<Integer> n = input.head.next.next;
		System.out.println("Input:");
		System.out.println(input);
		System.out.println("Response:");
		deleteNode(n);
		System.out.println(input);
	}
	
	public static void main(String[] args) throws Exception {
		new Question2_3().test();
	}

}
