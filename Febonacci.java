class Febonacci 
{
	public static void main(String[] args) 
	{
		System.out.println("Inside main method");
		int n=10, a=0, b=1;
		for(int i=0; i<=n; i++)
		{
			int sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
		}
	}
}
