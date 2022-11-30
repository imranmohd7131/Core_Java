package com;

class demo3 {
static int num;
int x=200;
static {
	num=10;
	num=0;
}
{
  num=501;
}
static {
	num=1;
	num=-100;
}
{
 x=100;	
}
public static void main(String[] args) {
	System.out.println(num);
	new demo3();
	demo3 obj=new demo3();
	System.out.println(num);
	System.out.println(obj.x);
}
{
System.out.println("CTE");	
}
}