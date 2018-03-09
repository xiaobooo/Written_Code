package com.boxiao.string;

public class Compare {
	public static void main(String[] args) {
		String str ="boxiao";
		String str2 = "Gewu";
		Object obj = str;
		 
		System.out.println(str.compareTo(str2));
		System.out.println(str.compareToIgnoreCase(str2));
		System.out.println(str.compareTo(obj.toString()));
	}
}
