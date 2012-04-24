class Stack {
	private int maxSize;
	private long[] stackData;
	private int top;
	
	// Constructor - create a new Stack
	public Stack(int max) {
		maxSize = max;
		stackData = new long[max];
		top = -1;
	}
	
	// isEmpty - an accessor to check Stack status
	public boolean isEmpty() {
		return top == -1;
	}
	
	// isFull - an accessor to check Stack status
	public boolean isFull() {
		return maxSize - 1 == top;
	}

	// push - a modifier to add to the Stack
	public void push(long value) {
		stackData[++top] = value;
	}
	
	// pop - a modifier to remove from the Stack
	public long pop() {
		return stackData[top--];
	}

	// peek - an accessor to look at top Stack item
	public long peek() {
		return stackData[top];
	}
}


public class StackApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long item;
		System.out.println("This is StackApp");
		Stack s = new Stack(20);		// Create a stack

		// Put some items on the stack
		s.push(40);						// Stack contains: 40
		s.push(10);						// Stack contains: 10 40
		s.push(90);						// Stack contains: 90 10 40

		// Let's peek
		System.out.print("Peeking at top item: ");
		System.out.println(s.peek());	// Shows 90

		// Popping items from the stack
		item = s.pop();					// item = 90, Stack contains: 10 40
		System.out.println(item);		// Shows 90
		while( !s.isEmpty() ) {			// Loop to pop rest of Stack and print
			item = s.pop();					// pop 10, Stack contains: 40
			System.out.println(item);		// pop 40, Stack.isEmpty() == true
		}
		
	}

}
