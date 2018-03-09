package com.boxiao.array;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class addArray {
	public static void main(String[] args) {
		String a[] = {"Liu","Bo","Xiao"};
		String b[] = {"Ge","Wu"};
		ArrayList list = new ArrayList(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		Object[] c = list.toArray();
		System.out.println(Arrays.toString(c));
	}
}
