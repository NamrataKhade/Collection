package com.nts.list;

import java.util.LinkedList;

public class LinkedListFeature {
	public static void main(String args[]) {

		LinkedList<String> lang = new LinkedList<>();
		lang.add("JAVA");

		lang.add("Python");
		lang.add("PHP");
		lang.add("Angular");
		lang.add("Android");

		System.out.println(lang);
		
		lang.addFirst("AWS");
		System.out.println(lang);
		
		lang.addLast("IOS");
		System.out.println(lang);
		
		lang.add(2,"Jenkin");
		System.out.println(lang);
		
		System.out.println("--------------------------------");
		for (String e : lang) {
			System.out.println(e);
		}

		System.out.println("------------------------");
		
		
		LinkedList<String> users=new LinkedList<>();
		users.add("Lisa");
		users.add("Shopia");
		users.add("Lili");
		
		System.out.println(users);
		
		System.out.println("------------------------");
		
		lang.addAll(users);
		System.out.println(lang);
		System.out.println("-----------------------------");
		
		System.out.println("Size od LinkList :"+lang.size());
		
	}

}
