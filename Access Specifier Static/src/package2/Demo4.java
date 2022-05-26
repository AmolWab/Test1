package package2;

import package1.Demo1;

public class Demo4 extends Demo1
{
	public static void main(String[] args)
	{
		System.out.println("static integer with inheritance");
		System.out.println(Demo1.a);
	//	System.out.println(Demo1.b); // default:- scope within package
	//	System.out.println(Demo1.c); // private := scope within class
		System.out.println(Demo1.d);  // here we use "extends" Demo4 to Demo1		
		System.out.println();
		System.out.println("static method with inheritance");
		Demo1.test1();
	//	Demo1.test2(); //default
	//	Demo1.test3(); //private
		Demo1.test4();
		
		
	}
	
}
