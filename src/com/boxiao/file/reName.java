package com.boxiao.file;

import java.io.File;

public class reName {
	public static void main(String[] args) {
		File oldName = new File("c:/program.txt");
		File newName = new File("c:/java.txt");
		if(oldName.renameTo(newName)) {
			System.out.println("重命名成功");
		}else {
			System.out.println("Error");
		}
	}
}
