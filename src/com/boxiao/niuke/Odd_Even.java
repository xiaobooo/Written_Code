package com.boxiao.niuke;

public class Odd_Even {
	
	public static boolean isOdd(int num) {
		if(num%2==0) {
			return false;	
		}else
			return true;

	}
	public static boolean isEven(int num) {
		if(num%2==0) {
			return true;	
		}else
			return false;
	}
	public static int[] reOrderArray(int [] array) {
	    int len = array.length;
	    int []odd = new int[len];
	    int []even = new int[len];
	    int m=0;
	    int n=0;
	    for(int i=0; i<len; i++) {
	    	if(isOdd(array[i])) {
	    		odd[m++]=array[i];
	    	}
	    	if(isEven(array[i])) {
	    		even[n++]=array[i];
	    	}
	    }
	    System.arraycopy(odd, 0, array, 0, m);
	    System.arraycopy(even, 0, array, m, n);
	    return array;
	}
	
	public static void main(String[] args) {
		int []array = {1,2,3,4,5,6,7,8,9,10};
		reOrderArray(array);
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
	}
}
