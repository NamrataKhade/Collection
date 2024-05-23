package com.nts.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {
	public static void main(String atgs[]) {
		
		//1:Collections.synchronizedList
		
		List<String> nameList=Collections.synchronizedList(new ArrayList<String>());
		nameList.add("JAVA");
	    nameList.add("Pyhon");
	    nameList.add("PHP");
	    
	    //add,remove-we don't need explicit synchronization
	    //To fetch /traverse the value from this list -we have to use explicit synchronization
	    
	    synchronized (nameList) {
			Iterator<String> itr = nameList.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
	    
	    
	    
	    //2:copyOnWriteArrayList -- is a class--Thread safe/synchronized already
	    //all operation are synchronized
	    
	    //we  don't need any explicit synchronization on any operation-add.remove.fetch.travse
	    
	   CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
	   empList.add("Tom");
	   empList.add("Steve");
	   empList.add("Sophia");
	   
	   Iterator itr=empList.iterator();
     	 while(itr.hasNext()) {
     		 System.out.println(itr.next());
     	 }
	   
	   
	   
	}

}
