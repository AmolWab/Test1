package package1;

public class Demo1 
{
	public static int a=10;
	static int b=20;  //default
	 private static int c=30;
	protected static int d=40;
	
	public static void test1()
	{
		System.out.println("1.public static method");
	}
	static void test2()
	{
		System.out.println("2. default static method");
	}
	
	private static void test3()
	{
		System.out.println("3. private static method");
	}
	
	protected static void test4()
	{
		System.out.println("4. protected static method"); // we print this in Demo 5 class
	}
	
	public static void main(String[] args)
	{
		System.out.println("static integer :- ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		 
		System.out.println();
		System.out.println("Static method");
		test1();
		test2();
		test3();
		test4();
		
		
		
		
	}
	
	
	

}
