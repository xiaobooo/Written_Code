package com.boxiao.timer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class getTime {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		System.out.println(sdf.format(date));
	}
}
