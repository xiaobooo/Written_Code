package com.boxiao.file;

import java.io.*;

public class Copy {
	public static void main(String[] args) throws Exception{
		BufferedWriter out1 = new BufferedWriter(new FileWriter("runoob"));
		out1.write("ÆôÃ÷ÐÇµÄ¹´Òý");
		out1.close();
		InputStream in = new FileInputStream(new File("runoob"));
		OutputStream out = new FileOutputStream(new File("destnfile"));
		byte[] buf = new byte[1024];
		int len;
		while((len = in.read(buf))>0) {
			out.write(buf,0,len);
		}
		in.close();
		out.close();
		BufferedReader in1 = new BufferedReader(new FileReader("destnfile"));
		String str;
		while((str = in1.readLine())!=null) {
			System.out.println(str);
		}
		in1.close();
	}
}
