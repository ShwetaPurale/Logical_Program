//import java.util.Scanner;

class Prime1 
{
	public static void main(String[] args) 
	{
		//Scanner sc=new Scanner(System.in);
		int n=0;
		//sc.nextInt();
		//int i;
		int count=0;
		if(n==1 || n==0)
		{
			System.out.println("Involid number");
		}

		for(int i=2; i<n; i++)
		{
			if(n%i==0)
			{
				System.out.println("number is not prime "+n);
				count=1;
				break;
				//continue;
			}
		}
		if(count==0)
		{
			System.out.println("number is prime "+n);
		}	
		//System.out.println();
	}
}
