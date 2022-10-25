package com.afterFedex.prac;



public class SwapStringDemo {
	public static void main(String[] args) {
//		SwapStringDemo.swap();
//		SwapStringDemo.stringSwap();
		letterReverse("today");
		wordReverse("Tomorrow is friday");
	}
 
	public static void stringSwap() {
		String a = "Hello";
		String b = "World";
		a = a + b;// HelloWorld
		
		b = a.substring(0, a.length() - b.length());// b=Hello
		
		a = a.substring(b.length());

		System.out.println("a= " + a);
		System.out.println("b= " + b);

	}

	public static void swap() {

		String x = " do it now";
		String y = " Go to action";

		// x = x + y;// do it now Go to action
		// y = x.substring(0, x.length() - y.length());
		// x = x.substring(y.length());

		// System.out.println("x= " + x + "\ny= " + y);

		System.out.println(x.toUpperCase());
	}
	public static void letterReverse(String name) {

		String m = "";
		for (int i = name.length()-1; i >=0 ; i--) {
			m = m + name.charAt(i);
		}
		System.out.println("letterReverse : " + m);
	}
	public static void wordReverse(String name) {

		String[] p = name.split(" ");
		String m = "";
		for (int i = p.length - 1; i >= 0; i--) {
			m = m + p[i] + " ";
		}
		System.out.println("wordReverse : " + m);
	}
}
