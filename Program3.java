package array;

public class Program3 
{
	static int a[]= {1,2,3,4,5};
	static char b[]= {'a','b','c','d','e'};
	       int c[]= {10,20,30,40,50};
	       char d[]= {'A','B','C','D','E'};
	       
   public static void main(String[] args)
   {
	   System.out.println("Static Variables:-");
	   int a=11;
	   System.out.println("Local int "+a);
	   System.out.println("Global int "+ Program3.a[0]); // if we initialize same variable then we can call global by class name 
	                                                       //   and execute it
	   
	   char b='b';
	   System.out.println("Local char "+b);
	   System.out.println("Global chara "+ Program3.b[0]);
	   
	   System.out.println();
	   System.out.println("Non static variable");
	   
	   int c=111;
	   System.out.println("Local int "+c);
	   
	   Program3 i=new Program3();
	   System.out.println("Global "+ i.c[0]);
	   
	   char d='Z';
	   System.out.println("Local char "+d);
	   
	   Program3 j=new Program3();
	   System.out.println("Global char "+j.d[0]);
	   
	   
	   
   }
	
	

}
