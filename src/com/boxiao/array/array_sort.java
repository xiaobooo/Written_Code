package com.boxiao.array;

import java.util.Arrays;

public class array_sort {

	public static void main(String[] args) throws Exception{
		int array[] = {2,5,-2,6,-3,8,0,-7,-9,4};
		Arrays.sort(array);
		printArray("数组排序结果为：",array);
		int index = Arrays.binarySearch(array, 1);
		System.out.println("元素 1在第  "+index+" 个位置");
		int newIndex = index-index-1;
		array = insertElement(array,1,newIndex);
		printArray("数组添加元素1 ", array);
	}

	private static int[] insertElement(int[] ori, int element, int index) {
		// TODO Auto-generated method stub
		int length = ori.length;
		int destination[] = new int[length+1];
		System.arraycopy(ori, 0, destination, 0, index);
		destination[index] = element;
		System.arraycopy(ori, index, destination, index+1, length-index);
		return destination;
	}

	private static void printArray(String message, int[] array) {
		// TODO Auto-generated method stub
		System.out.println(message
				+"[length: "+array.length+"]");
		for(int i=0;i<array.length;i++) {
			if(i!=0) {
				System.out.print(", ");
			}
		System.out.print(array[i]);
		}
		System.out.println();
	}
}
