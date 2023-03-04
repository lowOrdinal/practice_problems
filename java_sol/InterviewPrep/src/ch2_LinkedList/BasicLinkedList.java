package ch2_LinkedList;

public class BasicLinkedList<T> {
	
	Node<T> head;
	
	public BasicLinkedList() {
		this.head = null;
	}
	
	public void append(T x) {
		Node<T> n = new Node<T>(x);
		n.next = this.head;
		this.head = n;
	}
	
	@Override
	public String toString() {
		Node<T> curr = this.head;
		StringBuffer sb = new StringBuffer();
		sb.append("[ " );
		while (curr !=null) {
			sb.append(curr.data);
			sb.append(' ');
			curr = curr.next;
		}
		sb.append(']');
		return sb.toString();
	}

}
