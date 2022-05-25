package array;

public class Program2
{
	
	
	static char a[]= {'a','b','c','d','e'}; // "char [] a " this syntax is also correct
	       char b[]= {'e','d','c','b','a'}; // "char [] b"
 public static void main(String[] args)
 {
	 
	 System.out.println("Static character");
	 System.out.println(a[0]);
	 System.out.println(a[1]);
	 System.out.println(a[2]);
	 System.out.println(a[3]);
	 System.out.println(a[4]);
	 
	 System.out.println();
	 System.out.println("Non static character");
	 
	 Program2 i=new Program2();
	 
	 System.out.println(i.b[0]);
	 System.out.println(i.b[1]);
	 System.out.println(i.b[2]);
	 System.out.println(i.b[3]);
	 System.out.println(i.b[4]);
	 
	 Program1_Interger j=new Program1_Interger();
	 System.out.println(j.b[1]);
	 
	 System.out.println(Program1_Interger.a[1]);
	
 }
	
	

}
