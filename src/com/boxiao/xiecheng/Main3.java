package com.boxiao.xiecheng;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main3 {


/*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 
******************************开始写代码******************************/
    static boolean map(boolean flag) {
		return flag;


    }
/******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean res;
    
        boolean flag;
        int temp = Integer.parseInt(in.nextLine().trim());
        flag = (temp != 0);
  
        res = map(flag);
        System.out.println(String.valueOf(res ? 1 : 0));  
    }
}
