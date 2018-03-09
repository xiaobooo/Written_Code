package com.boxiao.timer;

import java.util.Calendar;

public class getYear {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DATE);
		int month = cal.get(Calendar.MONTH)+1;
		int year = cal.get(Calendar.YEAR);
		int dow = cal.get(Calendar.DAY_OF_WEEK);
		int dom = cal.get(Calendar.DAY_OF_MONTH);
		int doy = cal.get(Calendar.DAY_OF_YEAR);
		
		System.out.println("当前时间： "+cal.getTime());
		System.out.println("日期："+day);
		System.out.println("月份："+month);
		System.out.println("年份： "+year);
		System.out.println("一周的第几天： "+dow);
		System.out.println("一月的第几天: "+dom);
		System.out.println("一年的第几天： "+doy);
	}
}
