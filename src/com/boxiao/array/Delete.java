package com.boxiao.array;

import java.util.ArrayList;

public class Delete {
	public static void main(String[] args) {
		ArrayList<String> objArray = new ArrayList<String>();
		objArray.clear();
		objArray.add(0,"first");
		objArray.add(1,"second");
		objArray.add(2,"third");
		System.out.println("Before: "+objArray);
		objArray.remove(1);
		objArray.remove("first");
		System.out.println("After: "+objArray);
		
	}
}
