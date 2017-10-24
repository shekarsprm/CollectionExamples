package com.nacr.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionUtils {

	
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("10");
		list.add("20");
		List list1=new ArrayList();
		list1.add("30");
		list1.add("10");
		list1.add("40");
		list.add(list1);
		System.out.println(list);
		//list.remove(list1);
		//System.out.println(list);
		list.retainAll(list1);
		System.out.println(list);
	}
}
