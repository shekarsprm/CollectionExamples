package com.nacr.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		Set set = new TreeSet();
		set.add("10");
		set.add("25");
		set.add("35");
		set.add(40);
		set.add("acc");
		System.out.println("Set Of Values" + set);

		/*Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			Integer it = iter.next();
			if (it % 2 == 0) {
				iter.remove();
			}
		}*/
		System.out.println("After remove" + set);
	}
}
