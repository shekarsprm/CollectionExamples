package com.nacr.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * 
 * Vector is Synchronized & AL is not Synchronized
 * 
 * @author Welcome
 *
 */
public class ArrayListAndVector {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);

		for(Integer it:list){
			System.out.println(it);
		}
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("===================================");
		Vector vlist = new Vector();
		vlist.add(10);
		vlist.add(20);
		vlist.add(30);

		Enumeration enu = vlist.elements();
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		
		List listSync=Collections.synchronizedList(list);
		//Collections.synchronizedMap(m)
		//Collections.synchronizedSet(s)
		
		
		
		System.out.println(listSync);

	}
}
