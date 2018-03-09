package com.boxiao.method;

import java.util.ArrayList;
import java.util.Vector;

import com.boxiao.map.Map;

public class Instanceof {
	public static void main(String[] args) {
		Object testObject = new Map();
		displayObjectClass(testObject);
	}

	private static void displayObjectClass(Object o) {
		// TODO Auto-generated method stub
		if(o instanceof Vector)
			System.out.println("对象是 java.util.Vector 类的实例");
		else if(o instanceof ArrayList)
			System.out.println("对象是 java.util.ArrayList 类的实例");
		else
			System.out.println("对象是 "+ o.getClass()+" 类的实例");
	}
}
