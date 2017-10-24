package com.nacr.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class CursorCollectionUtils {
	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(3);
		ll.add(2);
		ll.add(1);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(6);

		Iterator<Integer> iter = ll.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("ListIter");
		ListIterator<Integer> listIter = ll.listIterator();
		while(listIter.hasNext()){
			System.out.println(listIter.next());
		}
		
	
	}
}
