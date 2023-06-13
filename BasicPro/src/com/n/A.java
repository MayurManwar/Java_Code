package com.n;

public class A {

	
 void  m1(){
	System.out.println(222);
}
 void  m1(int a)	{
	 System.out.println(66);
 }
	
 
 public static void main(String[] args) {
	A a= new A();
	a.m1();
	a.m1(6);
}
}
