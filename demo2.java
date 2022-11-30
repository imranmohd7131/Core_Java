package com;

class demo2 {
static int num;
static {
	System.out.println("Inside Block-1");
	num=10;
	num=0;
}
{
	System.out.println("Inside non-static Block-1");
}
static {
	System.out.println("Inside Block-2");
	num=1;
	num=-100;
}
{
	System.out.println("Inside non-static Block-2");
}
public static void main(String[] args) {
	System.out.println(num);
	new demo2();
	new demo2();
}
{
	System.out.println("Inside non-static Block-3");
}
}
