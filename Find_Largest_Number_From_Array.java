package array;

public class Find_Largest_Number_From_Array 
{
	public static void main(String[] args)
	{
		int a[]= {2,3,4,1,5,6,2,9,4,5};
		int max=a[0];
		int n=a.length;
		int min=a[0];
		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println("Largest Number is "+max);
		
		for(int j=0;j<n;j++)
		{
			if(a[j]<min)
			{
				min=a[j];
			}
		}
		
		System.out.println("Minimum number is "+min);
		
		
		
	}
	

}
