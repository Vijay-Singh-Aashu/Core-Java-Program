package collection_part;

import java.util.Stack;

public class Program26 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(2);
		stack.push(3);
		stack.push(5);
		stack.push(7);
		stack.push(11);

		System.out.println(stack);
		stack.pop();
		System.out.println(stack);

		System.out.println(stack.peek());

	}

}
