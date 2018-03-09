package com.boxiao.array;

import java.util.HashSet;
import java.util.Set;

public class Union {
	public static void main(String[] args) {
		String[] array1 = {"1","2","3"};
		String[] array2 = {"Bo","Xiao","Liu"};
		String[] result = union(array1,array2);
		for(String str:result) {
			System.out.println(str);
		}
	}

	private static String[] union(String[] array1, String[] array2) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		for(String str:array1) {
			set.add(str);
		}
		for(String str:array2) {
			set.add(str);
		}
		String[] result = {   };
		
		return set.toArray(result);
	}
}
