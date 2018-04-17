package com.boxiao.huawei;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

    public static int knapSack(int w, int[] mb, int[] val, int n){
        //创建状态转移矩阵
        int[][] temp = new int[n+1][w+1] ;

        //构建状态转移矩阵
        for(int i = 0; i<= n; i++){
            for(int j = 0; j <= w; j++){
                //边界条件
                if(i == 0 || j == 0){
                    temp[i][j] = 0;
                }else if(mb[i-1] <= j)
                    temp[i][j] = Math.max(val[i-1] + temp[i-1][j-mb[i-1]], temp[i-1][j]);
                else
                    temp[i][j] = temp[i-1][j];
            }
        }
        return temp[n][w];
    }
    public static int[] input() {
		Scanner sc=new Scanner(System.in);    
		String[] nums = null;   
		nums = sc.nextLine().split(" ");   
		int val[]=new int[nums.length];  
		for(int i=0;i<val.length;i++){  
		  val[i]=Integer.valueOf(nums[i]);  
		}
		return val;
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int w=sc.nextInt();
    	int mb[]=input();
    	int val[]=input();
    	int len=val.length;
        System.out.println(knapSack(w, mb, val, len));
    }

}