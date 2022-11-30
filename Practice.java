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
	
	int nu=3;
	int fact=1;
	for(int i=nu;i>=1;i--) {
		fact=fact*i;
	}System.out.println(fact);
	
	}
  }





