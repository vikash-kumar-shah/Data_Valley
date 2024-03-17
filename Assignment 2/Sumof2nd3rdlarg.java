//Question 1. Write a java program to find the sum of the 2nd and 3rd largest numbers in an array int[] values = {10, 51, 53, 39, 47, 44, 21};
public class Sumof2nd3rdlarg 
{
	public static void main(String[] args)
	{
		int[] values= {10,51,53,39,47,44,21};
		int len=values.length;
		for(int i=0;i<values.length;i++)
		{
			for(int j=i+1;j<values.length;j++)
			{
				if(values[i]>values[j])
				{
					int temp=values[i];
					values[i]=values[j];
					values[j]=temp;
				}
			}
		}
		System.out.println("The Sorted Array is");
		for(int i=0;i<values.length;i++)
		{
			System.out.print(values[i]+" ");
		}
		
		// The 2nd largest element is:
		System.out.println("");
		System.out.println("The Second Largest element is");
		int seclarg=values[len-2];
		System.out.println(seclarg);
		
		//The 3rd largest element is:
		System.out.println("The Third Largest element is");
		int thirlarg=values[len-3];
		System.out.println(thirlarg);
		
		//Sum of 2nd largest and third largest
		System.out.println("Sum of 2nd largest and third largest is:");
		
		int sum=seclarg+thirlarg;
		System.out.println(sum);
	}
}