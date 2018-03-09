package com.boxiao.file;

import java.io.*;

public class toAdd {
	public static void main(String[] args) {
		BufferedWriter out;
		try {
			out = new BufferedWriter(new FileWriter("filename"));
			out.write("清流全向");
			out.close();
			out = new BufferedWriter(new FileWriter("filename",true));
			out.write("启明星的指引");
			out.close();
			BufferedReader in = new BufferedReader(new FileReader("filename"));
			String str;
			while((str=in.readLine())!=null) {
				System.out.println(str);
			}
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
