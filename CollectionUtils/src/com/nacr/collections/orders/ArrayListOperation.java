package com.nacr.collections.orders;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOperation {

	public static void main(String[] args) {
		
		OrderVO ord1=new OrderVO();
		OrderVO ord2=new OrderVO();
		OrderVO ord3=new OrderVO();
		
		List<OrderVO> list=new ArrayList<OrderVO>();
		//Inserting & Storeing
		list.add(ord1);
		list.add(ord2);
		list.add(ord3);
		
		//Retrieve
		for(OrderVO vo:list){
     		System.out.println(vo);	
		}

		list.remove(ord1);
		
		
		
		
		
	}
}
