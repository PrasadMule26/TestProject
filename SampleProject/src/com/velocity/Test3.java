package com.velocity;

import java.util.HashSet;
import java.util.Iterator;

public class Test3 {
	
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Prasad");
		hs.add("Mahesh");
		hs.add("Ashwini");
		hs.add("Mayuri");
		
		Iterator<String>itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println("Name : "+itr.next());
		}
	}

}
