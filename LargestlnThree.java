
public class LargestlnThree {
	public static void main(String[] args) {
		int a = 40;
		int b = 30;
		int c = 50;
		
		int largest = (a>b)?(a>c?a:c):(b>c?b:c);
		
		System.out.print(largest + " is the largest.");
	}
}	
