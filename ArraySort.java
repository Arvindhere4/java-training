

import java.util.Arrays;

public class ArraySort
{
	public static void main(String[] args) 
	{
		int []arr= new int[]{2,15,4,62,30,19,20,11,35};
		Arrays.sort(arr);
		System.out.println("Array elements after sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
    

	}

}
