package ch2_LinkedList;

import java.util.HashSet;
import java.util.Set;

public class Question2_1 {

	// removes duplicates from list in linear time by using a buffer to track
	// what data has already been seen
	public <T> void removeDuplicates(BasicLinkedList<T> l) {
		Set<T> buffer = new HashSet<>();
		Node<T> prev = null;
		Node<T> curr = l.head;
		while (curr != null) {
			T data = curr.data;
			if (buffer.contains(data)) {
				prev.next = curr.next;
				Node<T> temp = curr;
				curr = curr.next;
				temp.next = null;
			}
			else {
				buffer.add(data);
				prev = curr;
				curr = curr.next;
			}
		}
	}
	
	private void test() {
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
		removeDuplicates(input);
		System.out.println(input);
		
	}
	
	public static void main(String[] args) {
		new Question2_1().test();
	}
}
