package ch2_LinkedList;

public class Question2_2 {

	// finds and returns kth to last element
	// first loop to determine how long the list is
	// then get the position of the kth elemnt
	public <T> T kthLast(BasicLinkedList<T> l, int k) throws Exception {
		Node<T> curr = l.head;
		int len = 0;
		while (curr !=null) {
			len++;
			curr = curr.next;
		}
		if (len < k) { 
			throw new Exception();
		}
		else {
			curr = l.head;
			int count = len-k;
			while (count != 0) {
				curr = curr.next;
				count--;
			}
			return curr.data;
		}
	}
	
	
	private void test() throws Exception {
		BasicLinkedList<Integer> input = new BasicLinkedList<>();
		input.append(3);
		input.append(5);
		input.append(5);
		input.append(3);
		input.append(3);
		input.append(7);
		input.append(8);
		input.append(8);
		System.out.println("Input:");
		System.out.println(input);
		System.out.println("Response:");
		System.out.println(kthLast(input,6));
	}
	
	public static void main(String[] args) throws Exception {
		new Question2_2().test();
	}
}
