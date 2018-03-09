package com.boxiao.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Buffer {
	public static void main(String[] args) throws Exception{
		File temp =File.createTempFile("test", ".txt",new File("E:\\CODE\\Eclipse\\CASE"));
		System.out.println("文件路径： "+temp.getAbsolutePath());
		temp.deleteOnExit();
		BufferedWriter out =new BufferedWriter(new FileWriter(temp));
		out.write("罗塞塔石碑");
		System.out.println("临时文件以创建");
		out.close();
	}
}
