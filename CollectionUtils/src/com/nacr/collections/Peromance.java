package com.nacr.collections;

import java.util.ArrayList;
import java.util.List;

public class Peromance {

	public static void arrayOperation() {

		long start = System.nanoTime();

		int x[] = new int[100000];
		for (int i = 0; i < x.length; i++) {
			x[i] = i;
		}
		long end = System.nanoTime();
		System.out.println("Dura==>" + (end - start));
	}

	public static void arrayList(){
		
		List list=new ArrayList();
		long start = System.nanoTime();
		for(int i=0;i<100000;i++){
			list.add(i);
		}
		long end = System.nanoTime();
		System.out.println("Duration=>"+(end-start));
	}
	public static void main(String[] args) {
		arrayOperation();
		arrayList();
	}
}
