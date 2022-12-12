package practice;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Practice {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
//	for(int i=1;i<=3;i++) {
//		for(int j=1;j<=3;j++) {
//			if((i==j) || (i%2==0) && (j==0) || (j%2==0)) {
//				System.out.print("_");
//			}else {
//				System.out.print("x");
//			}
//		}System.out.println("");
//	}
	
//	for(int i=1;i<=3;i++) {
//		for(int j=1;j<=3;j++) {
//			if(j%2==0) {
//				System.out.print("_");
//			}
//			else {
//				System.out.print("*");
//			}
//		}System.out.println("");
//	}
	
//	for(int i=1;i<=3;i++) {
//		for(int j=1;j<=3;j++) {
//			if((j%2==0 && i%2==0)|| (j%2!=0 && i%2!=0)) 
//			{
//			System.out.print("_");
//			}else {
//				System.out.print("*");
//			}
//		}System.out.println("");
//	}
	
//	int e=sc.nextInt();
//	int arr[]=new int[e];
//	for(int i=0;i<=e-1;i++) {
//			arr[i]=sc.nextInt();
//	}
//	for(int i=0;i<=e-1;i++) {
//		System.out.println(arr[i]);
//	}
//	HashMap hm=new HashMap();
//	hm.put("one",1);
//	hm.put("two",2);
//	TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
//	tm.put("java",1);
//	tm.put("sql",2);
//	Set k=hm.entrySet();
//	System.out.println(k);
//	for(Object a : k) {
//		System.out.println(a);
//	}
//	int arr[]= {1,2,8,4,8,6,4,2,3,3,9};
//	int arr2[]= {4,2,3,1,1,2,3,4,5,6,7,7};
//	for(int i=0;i<arr.length;i++) {
//		for(int j=0;j<arr2.length;j++) {
//		if(arr[i]==arr2[j]) {
//			System.out.print(arr[i]);
//		}
//		}
//	}
//	int i=1;
//	while(i<=10) {
//		System.out.print(i);
//		i++;
//	}
//	for(int i=1;i<=10;i++) {
//		System.out.println(i);
//	}
	
//	for(int i=1;i<=5;i++) {
//		for(int j=5;j>=1;j--) {
//			if(j>i) {
//			System.out.print(" ");
//			}else {
//				System.out.print(" X");
//			}
//		}System.out.println();
//	}
	
//	int arr1[]= {1,4,6,89,7,1};
//	int arr2[]= {6,2,1,89,7,4,1};
//	int arr3[]=new int[arr1.length];
//		for(int i=0;i<=arr1.length-1;i++) {
//			//if(arr1[i]==arr2[i]) {
//				arr3[i]=arr1[i]+arr2[i];
//				
//			//}
//		}
//		for(int i=0;i<=arr3.length-1;i++) {
//			System.out.println(arr3[i]);
//		}
	
//	String str="javavavaaaaaa";
//	char c='a';
//	int co=0;
//	for(int i=0;i<=str.length()-1;i++) {
//		if(str.charAt(i)==c) {
//			co++;
//		}
//	}System.out.println(co);
	
//	int year=sc.nextInt();
//	if(year%4==0 && year%100!=0) {
//		System.out.println("leap year");
//	}else {
//		System.out.println("not leap year");
//	}
	
//	int n=sc.nextInt();
//	int a=0;
//	int t=n;
//	int r=0;
//	while(n>0) {
//		a=n%10;
//		n=n/10;
//		r=r*10+a;
//	}if(t==r) {
//	System.out.println("plain");
//	}else {
//		System.out.println("not palin");
//	}
	
//	String str="momom";
//	String rev="";
//	for(int i=str.length()-1;i>=0;i--) {
//		rev+=str.charAt(i);
//	}
//	if(str.equals(rev)) {
//		System.out.println("palin");
//	}else {
//		System.out.println("not");
//	}
	
//	int f=10;
//	int s=0;
//	for(int i=10;i<=40;i++) {
//		f+=s;
//		i=f;
//		System.out.println(i);
//		s+=2;
//	}
	
//	int f=10;
//	int s=0;
//	for(int i=10;i<=28;i++){
//		f+=s;
//		i=f;
//		System.out.println(i);
//		s+=3;
//	}
	
	int n=sc.nextInt();int temp=0;
	for(int i=2;i<=n-1;i++) {
		if(n%i==0) {
			temp=temp+1;
		}
	}if(temp>0) {
		System.out.println("not prime number");
	}else {
		System.out.println("prime number");
	}
	
	}
  }





