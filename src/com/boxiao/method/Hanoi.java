package com.boxiao.method;

public class Hanoi {
	public static void main(String[] args) {
		int nDisks = 3;
		doTowers(nDisks,'A','B','C');
	}

	private static void doTowers(int topN, char from, char infer, char to) {
		// TODO Auto-generated method stub
		if(topN == 1) {
			System.out.println("Disk 1 from "
					+from +" to " + to );
		}else {
			doTowers(topN-1, from, to, infer);
			System.out.println("Disk "+topN+" from "
					+from +" to "+to);
			doTowers(topN-1, infer, from, to);
		}
	}
}
