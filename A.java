class B
{
	static void m1()
	{
			System.out.println("Inside the m1 method");
	}
}

class A 
{
	public static void main(String[] args) 
	{
		//int b;
		//b=B.a;
		//m1();
		m2();
		m3();
		B.m1();
		System.out.println("Inside the main method");
	}
	static void m2()
	{
	    System.out.println("Inside the m2 method");
	}
	static void m3()
	{
			System.out.println("Inside the m3 method");
	}
}

/*class B
{
 static void m1()
	{
		System.out.println("Inside the m1 method");
	}
}*/
