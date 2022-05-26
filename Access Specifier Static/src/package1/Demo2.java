package package1;

public class Demo2
{
	public static void main (String[] args)
	{
		System.out.println(" static integer");
		System.out.println(Demo1.a);
		System.out.println(Demo1.b);
		// System.out.println(Demo1.c);  // if we remove comment mark it show error
		System.out.println(Demo1.d);
		System.out.println();
		System.out.println("static method outside class");
		Demo1.test1();
		Demo1.test2();
	//	Demo1.test3(); // private
		Demo1.test4();
		
		
		
		
		
	}
	
	
	
	

}
