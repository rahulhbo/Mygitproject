package javapratices;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number to print Fibonacci" );
	
		int number =new Scanner(System.in).nextInt();
		System.out.println("Fibonacci searis up to "+number+ "number");
		for(int i=1;i<=number;i++) {
			
			System.out.print(fibonacci2(i)+" ");
		}
	}

	public static int fibonacci(int number) {
		
		if(number==1 || number==2 )
		return 1;
		{
	
	return fibonacci(number-1)+fibonacci(number-2);
}
	}
		
		public static int fibonacci2(int number) {
			
			if(number==1|| number==2) {
				return 1;
			}
			int a=1,b=1,c=1;
			for(int i=3;i<=number;i++)
			{
				c=a+b;
				a=b;
				b=c;
					
				
			}
			return c;
			
		}



}
