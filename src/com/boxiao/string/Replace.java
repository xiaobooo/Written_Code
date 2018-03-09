package com.boxiao.string;

public class Replace {
	public static void main(String[] args) {
		String str = "Boxiao wudi Bo";
		System.out.println(str.replace("x", "X"));
		System.out.println(str.replaceFirst("Bo", "Liu"));
		System.out.println(str.replaceAll("Bo", "Ba"));
	}
}
