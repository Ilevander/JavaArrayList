package com.arrayList;

import java.util.ArrayList;

public class AlgoArrayList {

	public static void main(String[] args) {

		
		 // Array List of 5 elements of Integer type
		//ArrayList<int> y = new ArrayList<int>(5);
		
		var x = new ArrayList<String>();
		System.out.println(x); //[]
		
		x.add("A");
		x.add("B");
		
		x.add(0, "C");
		
		x.add("D");
		
		System.out.println(x);// 1[C,A,B,D]
		
		x.remove(0);
		x.remove("B");
		
		System.out.println(x); //[A,D]
		
		System.out.println("size = " + x.size() );//length
		
		x.set(1, "B");//x[1] = B
		
		System.out.println(x); //[A,B]
		
		System.out.println("------------------------------");
		System.out.println(x.isEmpty()); //False
		System.out.println(x.contains("A")); //True
		System.out.println(x.indexOf("A")); //0
		System.out.println(x.get(0));  //A
		
		x.clear();
		
		System.out.println(x); //[]
		
		
		
		
	}

}
