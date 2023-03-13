package ch2_LinkedList;

public class Question2_5 {
	
	// reads two lists representing numbers, and returns a list representing their sum
	// assumes that head of the list is ones digit
	public BasicLinkedList<Integer> listSum(BasicLinkedList<Integer> ls1, BasicLinkedList<Integer> ls2) {
		int int1 = intFromList(ls1);
		int int2 = intFromList(ls2);
		return reverse(listFromInt(int1+int2));
	}
	
	// reads integer from list representation
	// assumes that head of the list is ones digit
	private int intFromList(BasicLinkedList<Integer> ls) {
		int acc = 0;
		int dig = 1;
		Node<Integer> curr = ls.head;
		while (curr != null) {
			acc += (dig * curr.data);
			dig *= 10;
			curr = curr.next;
		}
		return acc;
	}
	
	// converts integer to a list representation
	// representation treats head has highest digit
	private BasicLinkedList<Integer> listFromInt(int i) {
		BasicLinkedList<Integer> result = new BasicLinkedList<>();
		int curr = i;
		while (curr != 0) {
			result.append(curr%10);
			curr /= 10;
		}
		return result;
	}
	
	// reverses linked list
	public BasicLinkedList<Integer> reverse(BasicLinkedList<Integer> ls){
		BasicLinkedList<Integer> result = new BasicLinkedList<>();
		Node<Integer> curr = ls.head;
		while (curr != null) {
			result.append(curr.data);
			curr = curr.next;
		}
		return result;
	}
	
	private void test() {
		BasicLinkedList<Integer> ls1 = new BasicLinkedList<>();
		BasicLinkedList<Integer> ls2 = new BasicLinkedList<>();
		//first number
		ls1.append(6);
		ls1.append(1);
		ls1.append(7);
		//second number
		ls2.append(2);
		ls2.append(9);
		ls2.append(5);
		BasicLinkedList<Integer> sum = listSum(ls1,ls2);
		String form = "List 1:\n%s\nList 2:\n%s\nResult:\n%s";
		String response = String.format(form, ls1,ls2,sum);
		System.out.print(response);
	}
	
	public static void main(String[] args) {
		new Question2_5().test();
	}

}
