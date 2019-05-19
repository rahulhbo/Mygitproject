package javapratices;

public class fibonaccimeth {
	
	
	public static int fibonaccimeth(int number) {
		
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
