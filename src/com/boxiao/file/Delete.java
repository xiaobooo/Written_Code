package com.boxiao.file;

import java.io.File;

public class Delete {
	public static void main(String[] args) {
		try {
			File file = new File("test.txt");
			if(file.delete()) {
				System.out.println(file.getName()+" 文件已被删除！");
			}else {
				System.out.println("文件删除失败");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
