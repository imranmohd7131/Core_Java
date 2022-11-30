package com;

class demo1 {
static int num;
static {
	System.out.println("Inside Block-1");
	num=10;
	num=0;
}
static {
	System.out.println("Inside Block-2");
	num=1;
	num=-100;
}
public static void main(String[] args) {
	System.out.println(num);
}
static {
	System.out.println("Inside Block-3");
	num=200;
	num=301;
}
}
