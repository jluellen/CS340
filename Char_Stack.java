class Stack {
	private int maxSize;
	private long[] stackData;
	private int top;
	
	private char [] chStack;
	
	
	
	// Constructor - create a new Stack
	public Stack(int max) {
		maxSize = max;
		chStack = new char[max];
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
		chStack[++top] = value;
	}
	
	// pop - a modifier to remove from the Stack
	public long pop() {
		return chStack[top--];
	}

	// peek - an accessor to look at top Stack item
	public long peek() {
		return chStack[top];
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
		s.push("J");						// Stack contains: J
		s.push("R");						// Stack contains: R J
		s.push("L");						// Stack contains: L R J

		// Let's peek
		System.out.print("Peeking at top item: ");
		System.out.println(s.peek());	// Shows L

		// Popping items from the stack
		item = s.pop();					// item = 90, Stack contains: 10 40
		System.out.println(item);		// Shows 90
		while( !s.isEmpty() ) {			// Loop to pop rest of Stack and print
			item = s.pop();					// pop 10, Stack contains: 40
			System.out.println(item);		// pop 40, Stack.isEmpty() == true
		}
		
	}

}
