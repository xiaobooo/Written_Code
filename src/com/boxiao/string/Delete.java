package com.boxiao.string;

public class Delete {
	public static void main(String[] args) {
		String str ="Boxiao learn Java";
		System.out.println(removeCharAt(str, 3));
	}

	private static String removeCharAt(String s, int pos) {
		// TODO Auto-generated method stub
		return s.substring(0,pos)+s.substring(pos+1);
	}
}
