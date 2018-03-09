package com.boxiao.string;

public class Reverse {
	public static void main(String[] args) {
		String str = "Boxiao Liu";
		String reverse = new StringBuffer(str).reverse().toString();
		System.out.println(reverse);
	}
}
