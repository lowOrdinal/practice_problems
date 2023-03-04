package ch2_LinkedList;

public class Node<T> {
	T data;
	Node<T> next;
	
	public Node(T x) {
		this.data = x;
		this.next = null;
	}
	
}
