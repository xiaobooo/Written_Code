package com.boxiao.timer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Format {
	public static void main(String[] args) {
		Date date = new Date();
		String strDate = "yyyy--MM--dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(strDate);
		System.out.println(sdf.format(date));
	}
}
