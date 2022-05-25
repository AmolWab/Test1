package array;

public class Program1_Interger 
{
	static int a[]= {1,2,3,4,5};
           int b[]= {5,4,3,2,1};
       	static char d[]= {'a','b','c','d','e'};
	public static void main(String[] args)
	{
		System.out.println(" static Integer");
		System.out.println("length of a is "+ a.length);
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	System.out.println(a[4]);
	// System.out.println(a[5]); //error bcz we give value upto only 4 indexing
	
	System.out.println();
	System.out.println("Non static integer");
	
	Program1_Interger i=new Program1_Interger();
	
	System.out.println(i.b[0]);
	System.out.println(i.b[1]);
	System.out.println(i.b[2]);
	System.out.println(i.b[3]);
	System.out.println(i.b[4]);
	//System.out.println(i.b[5]);
	
	System.out.println();
	System.out.println("Use of integer in main method");
	int c[]= {10,20,30,40,50};
	System.out.println(c[0]);
	System.out.println(c[1]);
	System.out.println(c[2]);
	System.out.println(c[3]);
	System.out.println(c[4]);
	
	 System.out.println("Static character");
	 System.out.println(d[0]);
	 System.out.println(d[1]);
	 System.out.println(d[2]);
	 System.out.println(d[3]);
	 System.out.println(d[4]);
	 
	}
	
	
	
	

}
