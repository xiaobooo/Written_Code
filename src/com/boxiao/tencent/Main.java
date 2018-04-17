package com.boxiao.tencent;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
	    int imax=0;
	    int val=1;
	    if((n<=50000)&&(n<=m)&&(m<=100000)){
	     for(int i=1;i<n;i++){
	        val*=2;
	    }
	    if((m-val+1)>=val){
	        imax=m-val+1;
	    }
	    System.out.println(imax);
	    }
	}
}
