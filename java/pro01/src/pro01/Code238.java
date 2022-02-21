package pro01;

import java.util.Stack;

public class Code238 {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		Integer data = stk.peek();
		System.out.println("You peeked: " + data);
		stk.push(40);
		
		int index = stk.search(40);
		System.out.println("data 40 is at " + index);
		
		while(!stk.empty()) {
			System.out.println(stk.pop());
		}
	}

}
