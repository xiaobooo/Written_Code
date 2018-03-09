package com.boxiao.map;

import java.util.*;
import java.util.Map.Entry;

public class Map {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("xiaobo","bad" );
		map.put("wuge", "pig");
		map.put("liu", "wang");
		
		//方法一 普通使用 二次取值
		System.out.println("Map.keyset遍历：");
		for(String key : map.keySet()) {
			System.out.println(key+":"+map.get(key));
		}
		
		//方法二 
		System.out.println("Map.enterSet适用iterator遍历：");
		Iterator<Entry<String,String>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String,String> entry = it.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		//方法三 推荐 容量大时更适用
		System.out.println("Map.enterSet遍历: ");
		for(Entry<String,String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		//方法四 只能遍历value
		System.out.println("Map.values遍历：");
		for(String a : map.values()) {
			System.out.println(a);
		}
	}
}
