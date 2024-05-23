package com.nts.list;

import java.util.Stack;

public class StackExample {
	
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("Namrata");
		s.push("Pratiksha");
		s.push(100);
		s.push(12.78);
		
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		System.out.println(s.search(100));
		
		
		
	}

}
