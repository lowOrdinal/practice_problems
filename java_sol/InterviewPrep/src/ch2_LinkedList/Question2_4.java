package ch2_LinkedList;

public class Question2_4 {
	
	// partitions list around x, so that all elements < x appear before those >= x
	// reads through list, moving any element >= x to an auxilary list
	// tail next pointer of remaining elements is set to head of auxiliary list
	public void partition(BasicLinkedList<Integer> l, int x) {
		Node<Integer> curr = l.head;
		Node<Integer> lPart = null;
		Node<Integer> rPart = null;
		
		//sort into left and right partitions
		while (curr != null) {
			if (curr.data < x) {
				if (lPart == null) {
					lPart = curr;
					curr = curr.next;
					lPart.next = null;
				}
				else {
					Node<Integer> temp = curr;
					curr = curr.next;
					temp.next = lPart;
					lPart =temp;
				}
			}
			else {
				if (rPart == null) {
					rPart = curr;
					curr = curr.next;
					rPart.next = null;
				}
				else {
					Node<Integer> temp = curr;
					curr = curr.next;
					temp.next = rPart;
					rPart =temp;
				}
			}
		}
		
		// concatenate
		curr = lPart;
		while (curr != null) {
			Node<Integer> temp = curr;
			curr = curr.next;
			temp.next = rPart;
			rPart = temp;
		}
		l.head = rPart;
	}
	
	private void test() {
		BasicLinkedList<Integer> input = new BasicLinkedList<>();
		input.append(1);
		input.append(3);
		input.append(3);
		input.append(1);
		input.append(3);
		input.append(3);
		input.append(3);
		input.append(2);
		input.append(1);
		input.append(1);
		System.out.println("Input:");
		System.out.println(input);
		System.out.println("Response:");
		partition(input, 3);
		System.out.println(input);
	}
	
	public static void main(String[] args) {
		new Question2_4().test();
	}

}
