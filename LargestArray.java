

public class LargestArray
{
	static int arr[]=  {55,77,88,99,1010,2020};
	static int largest()
	{
	int i;
	int max = arr[0];
	for(i=1; i<arr.length; i++)
		if(arr[i]>max)
		  max = arr[i];
		return max;
	}
public static void main(String[]args)
{
	System.out.println(" largest element in array is:" +largest());
}
}
