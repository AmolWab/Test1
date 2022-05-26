package package2;

import package1.Demo1;

public class Demo3 
{
	public static void main(String[] args)
	{
		System.out.println("static integer outside package");
		System.out.println(Demo1.a);
		// System.out.println(Demo1.b); // default:- scope within package
		// System.out.println(Demo1.c); //private:- scope within class
		// System.out.println(Demo1.d); //protected:- if not use extend then it show error
		System.out.println();
		System.out.println("static method outside package");
		Demo1.test1();
	//	Demo1.test2(); //default
	//	Demo1.test3(); //private
	//	Demo1.test4(); //protected
		
		
	}

}
