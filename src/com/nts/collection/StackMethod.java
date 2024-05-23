package com.nts.collection;

import java.util.Stack;

public class StackMethod {
	public static void main(String args[]) {
		//Stack s=new Stack();
		Stack<String> stack = new Stack<String> ();
		stack.push("Swami");
		stack.push("Ayush");
		stack.push("Namrata");
		stack.push("Kanif");
		 stack.push("Dhananjay");
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		String peek=stack.peek();
		System.out.println("peek Method used :"+peek);
		System.out.println(stack);
		
	int offset=stack.search("Swami");
	System.out.println(offset);
	
	int offset1=stack.search("Anuradha");
	System.out.println(offset1);
		
	}

}
