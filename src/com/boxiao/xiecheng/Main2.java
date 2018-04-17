package com.boxiao.xiecheng;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main2 {


/*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 
******************************开始写代码******************************/
    static String[] groupList(String[] str) {
		return str;
    	
    }
/******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] res;
            
        int strsize = 0;
        strsize = Integer.parseInt(in.nextLine().trim());
        String[] str = new String[strsize];
        String stritem;
        for(int i = 0; i < strsize; i++) {
            try {
                stritem = in.nextLine();
            } catch (Exception e) {
                stritem = null;
            }
            str[i] = stritem;
        }
  
        res = groupList(str);
        for(int res_i=0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }

    }
}
