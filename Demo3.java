class Demo
{
	static int b = 100;
	public static void main(String[] args) 
	{
		int c=30;
		System.out.println(b);
		//System.out.println(Demo3.b);
		Demo d1=new Demo();
		d1.m1(c);		
	}
	void m1(int c)
	{
		int a=200;
		int result=a+c;
		System.out.println("Result is "+result);
		System.out.println("Inside the m1 method");
	}
}

