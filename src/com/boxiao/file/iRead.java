package com.boxiao.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class iRead {
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("runoob.txt"));
			String str;
			while((str = in.readLine())!=null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			
		}
	}
}
